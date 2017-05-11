package koushik.parkk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
 public TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView)findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();
        int longit = extras.getInt("long");
        int latit =extras.getInt("lat");

        t.append("\n " + longit+ " "+latit);
    }
}
