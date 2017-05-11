package koushik.parkk;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class pay extends AppCompatActivity {
    public ImageView i;
    public ImageView image;
    public Button button4;
    public Button button6;
    private ProgressDialog loading;
    String p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        button4 =(Button)findViewById(R.id.button4);
        button6 =(Button)findViewById(R.id.button6);
        i = (ImageView) findViewById(R.id.imageView);
        image = (ImageView)findViewById(R.id.imageView3);
        Bundle extras = getIntent().getExtras();
        String m = extras.getString("name");

        switch (m) {
            case "Parkstop 1":{
                i.setImageResource(R.drawable.park_1);
                p = "1";
                break;}
            case "Parkstop 2":{
                i.setImageResource(R.drawable.park_2);
                p = "2";
                break;}
            case "Parkstop 3":{
                i.setImageResource(R.drawable.park_3);
                p = "3";
                break;}
            case "Parkstop 4":{
                i.setImageResource(R.drawable.park_4);
                p = "4";
                break;}
            case "Parkstop 5":{
                i.setImageResource(R.drawable.park_5);
                p = "5";
                break;}
        }


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });

    }
    private void getData() {
        String idd = p.toString().trim();
        if (idd.equals("")) {
            Toast.makeText(this, "Please enter an id", Toast.LENGTH_LONG).show();
            return;
        }
        loading = ProgressDialog.show(this, "Please wait...", "Fetching...", false, false);

        String url = Config.DATA_URL+p.toString().trim();
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(pay.this,error.getMessage().toString(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String response){
        String id="";
        String avail="";
        String reserve="";

        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject collegeData = result.getJSONObject(0);
            id = collegeData.getString(Config.KEY_ID);
            avail = collegeData.getString(Config.KEY_AVAIL);
            reserve = collegeData.getString(Config.KEY_RESERVE);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if(avail.toString().equals("1")){
            if(reserve.toString().equals("0")){
                image.setImageResource(R.drawable.res);
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gate = new Intent(getApplicationContext(),gateway.class);
                        gate.putExtra("page",p);
                        startActivity(gate);
                    }
                });
            }
        }
        else{
            image.setImageResource(R.drawable.resyq);
        }

    }

}
