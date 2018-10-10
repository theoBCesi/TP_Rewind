package com.example.tristans.a1toa2toa3toa1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends Activity {

    Activity lecontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lecontext=this;
        Button btaction = (Button) findViewById(R.id.buttonBackToAPP1);
        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Log.d("APP_3", "GO BACK TO APP 1");
                //Intent defineIntent = new Intent(lecontext, MainActivity.class);
                finish();
            }
        });
    }
}