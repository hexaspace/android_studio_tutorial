package com.androidhexa.loginmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.function.BiConsumer;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_pw = (EditText) findViewById(R.id.et_pw);
        Button btn_register = (Button) findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_login = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(intent_login);
            }
        });

    }
}