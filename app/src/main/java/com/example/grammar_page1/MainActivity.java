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
        ViewGroup List2 = (ViewGroup) findViewById(R.id.list2);
        ViewGroup List3 = (ViewGroup) findViewById(R.id.list3);
        ViewGroup List4 = (ViewGroup) findViewById(R.id.list4);
        ViewGroup List5 = (ViewGroup) findViewById(R.id.list5);
        ViewGroup List6 = (ViewGroup) findViewById(R.id.list6);

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

        List2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(MainActivity.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        Day2Activity.class);
                startActivity(intent);
            }
        });

        List3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(MainActivity.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        Day3Activity.class);
                startActivity(intent);
            }
        });

        List4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(MainActivity.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        Day4Activity.class);
                startActivity(intent);
            }
        });

        List5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(MainActivity.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        Day5Activity.class);
                startActivity(intent);
            }
        });

        List6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지금 현재 activity
                Intent intent = new Intent(MainActivity.this,
                        //실행할 activity
                        //manifests->AndroidMainfest.xml에 클래스 추가
                        Day6Activity.class);
                startActivity(intent);
            }
        });
    }
}