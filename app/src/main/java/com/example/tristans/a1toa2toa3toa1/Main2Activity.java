package com.example.tristans.a1toa2toa3toa1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity {

    Activity lecontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lecontext = this;
        Button btaction = (Button) findViewById(R.id.buttonToAPP3);
        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Log.d("APP_2", "GO TO APP3");
                Intent defineIntent = new Intent(lecontext, Main3Activity.class);
                lecontext.startActivityForResult(defineIntent, 42);
                //finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 42) {
            finish();
        }
    }
}
