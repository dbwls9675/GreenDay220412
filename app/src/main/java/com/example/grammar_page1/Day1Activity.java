package com.example.grammar_page1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Day1Activity extends Activity {
    Button btn1, btn2, btnBack;
    TextView currentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1);

        btnBack = (Button) findViewById(R.id.btnReturn);//돌아가기
        btn1 = (Button) findViewById(R.id.prevBtn);//이전
        btn2 = (Button) findViewById(R.id.nextBtn);//다음
        currentText = (TextView) findViewById(R.id.tvNumber);// 0/0

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

}
