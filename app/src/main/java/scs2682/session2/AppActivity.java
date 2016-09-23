package scs2682.session2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        Log.w("Hello World","onCreate()");

    }

}
