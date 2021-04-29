package com.example.basic_study;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
    public void Btn1Click(View v){
        Toast toast = Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END| Gravity.BOTTOM, 10, 10);

        toast.show();
    }
}
