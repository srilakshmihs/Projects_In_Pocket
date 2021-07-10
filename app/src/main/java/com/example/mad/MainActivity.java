package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, smsbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //form Activity
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFormCode();
            }
        });
        //SMS Activity
        smsbutton = (Button) findViewById(R.id.button2);
        smsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSendingsms();
            }
        });
    }
    public void openFormCode(){
        Intent intent = new Intent(this, Formcode.class);
        startActivity(intent);
    }
    public void openSendingsms(){
        Intent intent = new Intent(this, SmsCode.class);
        startActivity(intent);
    }
}
