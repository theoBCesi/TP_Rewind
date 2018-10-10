package com.example.tristans.a1toa2toa3toa1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    Activity lecontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lecontext=this;
        Button btaction = (Button) findViewById(R.id.buttonToAPP2);
        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Log.d("APP_1", "GO TO APP2");
                Intent defineIntent = new Intent(lecontext, Main2Activity.class);
                lecontext.startActivityForResult(defineIntent, 1);
            }
        });
    }
}
