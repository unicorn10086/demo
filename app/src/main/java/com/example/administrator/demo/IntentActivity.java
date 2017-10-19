package com.example.administrator.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Button login_button=(Button) findViewById(R.id.button);
        login_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(IntentActivity.this,"you clicked login button",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(IntentActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
