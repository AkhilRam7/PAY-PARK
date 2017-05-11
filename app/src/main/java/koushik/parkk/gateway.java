package koushik.parkk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class gateway extends AppCompatActivity {
    public SeekBar seek;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public Button b;

    RequestQueue requestQueue;
    String insertUrl = "http://192.168.43.3/insertStudent.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gateway);
        b = (Button)findViewById(R.id.button7);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setText("CODE:");
        seekbar();
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        Bundle extras = getIntent().getExtras();
        final String m = extras.getString("page");

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView8.setText("CODE:18569");
                Toast.makeText(gateway.this,"Payment Successful",Toast.LENGTH_LONG).show();
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
                        parameters.put("avail","0".toString());
                        parameters.put("reserve","1".toString());
                        parameters.put("id",m.toString());
                        return parameters;
                    }
                };
                requestQueue.add(request);

                Intent users = new Intent(getApplicationContext(),user.class);
                users.putExtra("use",m);
                startActivity(users);
            }
        });
    }
    public void seekbar() {
        seek = (SeekBar) findViewById(R.id.seekBar);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView6.setText("TIME: " + seek.getProgress()+"/"+seek.getMax()/20+" Hours");
        textView7.setText("Fare: " + seek.getProgress()+"/"+seek.getMax()/2+" INR");

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress_value;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress_value = progress;
                textView6.setText("TIME: " + seek.getProgress()/20+"/"+seek.getMax()/20+" Hours");
                textView7.setText("Fare: " + (seek.getProgress()/20)*10+"/"+seek.getMax()/2+" INR");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
