package com.example.colordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

            TextView  txtView1, txtView2, txtView3;
            EditText edtText;
            Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView1 = findViewById(R.id.txtView1);
        txtView2 = findViewById(R.id.txtView2);
        txtView3 = findViewById(R.id.txtView3);
        edtText = findViewById(R.id.edtText);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String input = edtText.getText().toString();
               if(input.equals("1")){
                   txtView1.setBackgroundColor(Color.BLUE);
                   txtView2.setBackgroundColor(Color.GREEN);
                   txtView3.setBackgroundColor(Color.GREEN);
               }else if(input.equals("2")){
                   txtView1.setBackgroundColor(Color.GREEN);
                   txtView2.setBackgroundColor(Color.BLUE);
                   txtView3.setBackgroundColor(Color.GREEN);
               }else if(input.equals("3")){
                   txtView1.setBackgroundColor(Color.GREEN);
                   txtView2.setBackgroundColor(Color.GREEN);
                   txtView3.setBackgroundColor(Color.BLUE);
               }else{
                   txtView1.setBackgroundColor(Color.RED);
                   txtView2.setBackgroundColor(Color.RED);
                   txtView3.setBackgroundColor(Color.RED);
               }

            }
        });



    }
}