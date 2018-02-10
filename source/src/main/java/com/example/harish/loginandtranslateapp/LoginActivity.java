package com.example.harish.loginandtranslateapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.bLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Username.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void validate(String userUsername, String userPassword){
        if((userUsername.equals("Harish")) && (userPassword.equals("5566"))){
            Intent intent = new Intent(LoginActivity.this, TranslateActivity.class);
            startActivity(intent);
        }else {
            counter--;

            if(counter==0){
                Login.setEnabled(false);
            }
        }
    }
}
