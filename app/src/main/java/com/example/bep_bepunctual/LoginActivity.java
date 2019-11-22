package com.example.bep_bepunctual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText mTextUsername;
    private EditText mTextPassword;
    private Button mButtonLogin;
    private Button mButtonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextUsername = (EditText) findViewById(R.id.edt_Benutzer);
        mTextPassword = (EditText) findViewById(R.id.edt_password);

        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //wenn Button geklickt

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class );
                startActivity(intent);
                finish();

            }
        });


    }
}
