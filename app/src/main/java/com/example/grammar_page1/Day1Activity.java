package com.example.grammar_page1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Day1Activity extends Activity {
    Button btn1, btn2, btnBack;
    TextView currentText;
    ViewFlipper vFlipper;
    int vfCount, curNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1);

        btnBack = (Button) findViewById(R.id.btnReturn);//돌아가기
        btn1 = (Button) findViewById(R.id.prevBtn);//이전
        btn2 = (Button) findViewById(R.id.nextBtn);//다음
        currentText = (TextView) findViewById(R.id.tvNumber);// 0/0
        vFlipper = (ViewFlipper) findViewById(R.id.vewF1);

        //현재 페이지 수
        vfCount = vFlipper.getChildCount();
        currentText.setText("1" + "/" + vfCount);

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious();
                if (curNum <= 0) {
                    curNum = vfCount - 1;
                } else {
                    curNum--;
                }
                currentText.setText((curNum + 1) + "/" + vfCount);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
                if (curNum >= vfCount - 1) {
                    curNum = 0;
                } else {
                    curNum++;
                }
                currentText.setText((curNum + 1) + "/" + vfCount);
            }
        });

    }

}
