package com.example.gumaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_signup;
    private Button btn_signin;
    private EditText editTextEmail, editTextPassword;
    private FirebaseAuth mAuth;


    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        constraintLayout=findViewById(R.id.container);

        btn_signup = (Button) findViewById(R.id.btn_signup);
        btn_signup.setOnClickListener(this);

        btn_signin = (Button) findViewById(R.id.btn_signin);
        btn_signin.setOnClickListener(this);

        editTextEmail = (EditText) findViewById(R.id.email);
        editTextPassword = (EditText) findViewById(R.id.password);

        mAuth = FirebaseAuth.getInstance();
        }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_signup:
                startActivity(new Intent(this, signup.class));
                break;
            case R.id.btn_signin:
                userLogin();
                break;
        }
    }

    private void userLogin() {
        String email = editTextEmail.getText().toString().trim();
        String password= editTextPassword.getText().toString().trim();
        if(email.isEmpty()){
            editTextEmail.setError("Silakan masukkan email!");
            editTextEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Email tidak valid!");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Silakan masukkan password!");
            editTextPassword.requestFocus();
            return;
        }
        if(password.length() < 6){
            editTextPassword.setError("Password harus terdiri minimal 6 karakter!");
            editTextPassword.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(SecondActivity.this, Activity3.class));
                }else{
                    Toast.makeText(SecondActivity.this, "Gagal sign in, email atau password salah!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}



