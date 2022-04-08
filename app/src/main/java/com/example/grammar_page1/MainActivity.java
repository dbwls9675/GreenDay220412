package com.example.grammar_page1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("문법 리스트");

        ViewGroup List1 = (ViewGroup) findViewById(R.id.list1);
        List1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(MainActivity.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        Day1Activity.class);
                startActivity(intent);
            }
        });
    }
}