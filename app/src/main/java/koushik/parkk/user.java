package koushik.parkk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class user extends AppCompatActivity {
    public ImageButton imgc;
    public Button out;
    RequestQueue requestQueue;
    String insertUrl = "http://192.168.43.3/insertStudent.php";
    String insertUrll = "http://192.168.43.3/insert.php";
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        imgc = (ImageButton)findViewById(R.id.imageButton);
        out = (Button)findViewById(R.id.button);
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        Bundle extras = getIntent().getExtras();
        final String n = extras.getString("use");

        imgc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i%2==0){
                    imgc.setImageResource(R.drawable.open);
                    i=i+1;
                }
                else{
                    imgc.setImageResource(R.drawable.close);
                    i=i+1;
                }
                StringRequest request = new StringRequest(Request.Method.POST, insertUrll, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> parameters  = new HashMap<String, String>();
                        parameters.put("id", n.toString());
                        return parameters;
                    }
                };
                requestQueue.add(request);
            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> parameters  = new HashMap<String, String>();
                        parameters.put("avail","1".toString());
                        parameters.put("reserve","0".toString());
                        parameters.put("id", n.toString());
                        return parameters;
                    }
                };
                requestQueue.add(request);
                Intent again = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(again);
            }
        });

    }


}
