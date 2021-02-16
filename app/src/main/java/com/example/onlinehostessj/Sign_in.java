package com.example.onlinehostessj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.SQLOutput;

public class Sign_in extends AppCompatActivity {

    TextInputLayout FirstNameT , LastNameT ,EmailT ,PhoneNumberT , PasswordT , RePasswordT;
    Button CreateBtn ;

    FirebaseDatabase  rootData ;
    DatabaseReference reference ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        FirstNameT = (TextInputLayout) findViewById(R.id.FirstName);
        LastNameT = findViewById(R.id.LastName);
        EmailT = findViewById(R.id.Email);
        PhoneNumberT = findViewById(R.id.PhoneNumber);
        PasswordT = findViewById(R.id.Password);
        RePasswordT = findViewById(R.id.passwordR);

        Button CreateBtn = (Button) findViewById(R.id.Create);
        Toast.makeText(Sign_in.this , "work3" ,Toast.LENGTH_LONG).show();


        CreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sign_in.this , "work1" ,Toast.LENGTH_LONG).show();

                SaveData() ;

            }
        }) ;


    }

    public void SaveData() {

        System.out.println("122");
        Toast.makeText(Sign_in.this , "work" ,Toast.LENGTH_LONG).show();
        rootData = FirebaseDatabase.getInstance();
        reference = rootData.getReference("Users");
        String FName = FirstNameT.getEditText().getText().toString();
        String LName = LastNameT.getEditText().getText().toString();
        String Email = EmailT.getEditText().getText().toString();
        String PNumber = PhoneNumberT.getEditText().getText().toString();
        String Pass = PasswordT.getEditText().getText().toString();
        String RPass = RePasswordT.getEditText().getText().toString();

        SignInHelperClass SignAdd = new SignInHelperClass(FName , LName , Email , PNumber , Pass , RPass);


        reference.child(PNumber).setValue(SignAdd);

    }
}