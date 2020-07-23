package com.example.study_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText et_test;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 처음 실행했을 때 생명주기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //activity_main.xml 화면 파이 연결

        et_test=findViewById(R.id.et_test); //특정 id를 얘한테 속성을 부여해라 Resource.id. ->xml과 연결
        btn_test=findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {//버튼을 클릭했을 때 action
            @Override
            public void onClick(View view) {
                et_test.setText("jjungnie");//버튼 클릭했을 때 text를 써줘라
            }
        });
    }
}