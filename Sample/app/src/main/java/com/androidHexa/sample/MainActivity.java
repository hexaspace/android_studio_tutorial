//안드로이드 여러 기능 구현해보기. 홍드로이드 유튜브 참고
package com.androidHexa.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText et_id;
    private Button btn_id;
    private Button btn_move;
    private String str;
    private ImageView img;
    private ListView list;
    private String shared = "file";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_id = findViewById(R.id.et_id);
        btn_id = findViewById(R.id.btn_id);
        btn_move = findViewById(R.id.btn_move);
        img = (ImageView) findViewById(R.id.img);
        list = (ListView)findViewById(R.id.list);

        //리스트에 데이터 저장
        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);

        data.add("유튜브");
        data.add("트위치");
        data.add("카카오티비");
        adapter.notifyDataSetChanged();
        //종료시 문자 불러오기
        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String value = sharedPreferences.getString("home", "");
        et_id.setText(value);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"이미지누름",Toast.LENGTH_SHORT).show();
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_id.getText().toString();
                Intent intent = new Intent(MainActivity.this, NaviActivity.class);
                intent.putExtra("str",str);
                startActivity(intent); //액티비티 이동동
           }
        });

        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_id.setText("홈드로알");
            }
        });


    }

    @Override
    protected void onDestroy() { //액티비티에서 벗어날때 저장, 설정값들을 저장할때 주로 사용
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = et_id.getText().toString();
        editor.putString("home", value);
        editor.commit();
    }
}