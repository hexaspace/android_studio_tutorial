package com.androidhexa.loginmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RoomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);

        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_pw = (EditText) findViewById(R.id.et_pw);
        TextView tv_welcome = (TextView) findViewById(R.id.tv_welcome);



    }
}