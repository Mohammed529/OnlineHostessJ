package com.example.onlinehostessj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private Button Sign_inPage ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Sign_inPage = findViewById(R.id.Sign_inB);
        Sign_inPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this , Sign_in.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this , "work" ,Toast.LENGTH_LONG).show();

            }
        });


    }


}