package com.example.Grammar_English;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

public class JapanMain extends AppCompatActivity {//일본어 문법 리스트

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japanlist_main);
        setTitle("일본어 문법 리스트");

        ViewGroup List1 = (ViewGroup) findViewById(R.id.list1);
        ViewGroup List2 = (ViewGroup) findViewById(R.id.list2);
        ViewGroup List3 = (ViewGroup) findViewById(R.id.list3);
        ViewGroup List4 = (ViewGroup) findViewById(R.id.list4);
        ViewGroup List5 = (ViewGroup) findViewById(R.id.list5);
        ViewGroup List6 = (ViewGroup) findViewById(R.id.list6);

        List1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(JapanMain.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        JapDay1.class);
                startActivity(intent);
            }
        });

        List2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(JapanMain.this,
                        JapDay2.class);
                startActivity(intent);
            }
        });

        List3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(JapanMain.this,
                        JapDay3.class);
                startActivity(intent);
            }
        });

        List4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(JapanMain.this,
                        JapDay4.class);
                startActivity(intent);
            }
        });

        List5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(JapanMain.this,
                        JapDay5.class);
                startActivity(intent);
            }
        });

        List6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(JapanMain.this,
                        JapDay6.class);
                startActivity(intent);
            }
        });
    }
}