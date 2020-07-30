package com.example.code0728_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText; //xml에서 만든 수정 텍스트 불러올때 사용
import android.widget.Button; //xml에서 만든 버튼 불러올때 사용
import android.widget.TextView; //xml에서 만든 텍스트 불러올때 사용

public class MainActivity extends AppCompatActivity {
    //변수 선언
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, bresult, bclear;
    private EditText edit;
    private TextView text;

    private int a;
    private int where = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //onCreate: 안드로이드가 켜지는 순간 작동하는 메소드
        setContentView(R.layout.activity_main); //activity_main.xml과 연결되어 있음을 알수있음

        b1 = (Button)findViewById(R.id.b1); //id로 xml에서 만든 버튼 불러오기
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b0 = (Button)findViewById(R.id.b0);
        badd = (Button)findViewById(R.id.badd);
        bsub = (Button)findViewById(R.id.bsub);
        bmul = (Button)findViewById(R.id.bmul);
        bdiv = (Button)findViewById(R.id.bdiv);
        bresult = (Button)findViewById(R.id.bresult);
        bclear = (Button)findViewById(R.id.bclear);

        edit = (EditText)findViewById(R.id.edittext);
        text = (TextView)findViewById(R.id.textview);

        OnClickListener cl = new OnClickListener() {
            @Override
            public void onClick(View view) { //각 버튼이 눌릴 때마다 하는 기능
                //숫자 버튼
                if (view == b1) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 1); }
                else if (view == b2) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 2); }
                else if (view == b3) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 3); }
                else if (view == b4) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 4); }
                else if (view == b5) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 5); }
                else if (view == b6) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 6); }
                else if (view == b7) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 7); }
                else if (view == b8) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 8); }
                else if (view == b9) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 9); }
                else if (view == b0) {
                    text.setText("");
                    edit.setText(edit.getText().toString() + 0); }

                //연산 버튼
                else if (view == badd) {
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where = 1; }
                else if (view == bsub) {
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where = 2; }
                else if (view == bmul) {
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where = 3; }
                else if (view == bdiv) {
                    a = Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where = 4; }

                //결과 버튼
                else if (view == bresult){
                    if(where == 1){
                        a = a + Integer.valueOf(edit.getText().toString().trim());
                        edit.setText("");
                        text.setText(Integer.toString(a)); }
                    if(where == 2){
                        a = a - Integer.valueOf(edit.getText().toString().trim());
                        edit.setText("");
                        text.setText(Integer.toString(a)); }
                    if(where == 3){
                        a = a * Integer.valueOf(edit.getText().toString().trim());
                        edit.setText("");
                        text.setText(Integer.toString(a)); }
                    if(where == 4){
                        a = a / Integer.valueOf(edit.getText().toString().trim());
                        edit.setText("");
                        text.setText(Integer.toString(a)); } }

                //C 버튼
                else if (view == bclear){
                    edit.setText("");
                    text.setText(""); }
            }
        };

        //화면 표시
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);
        b4.setOnClickListener(cl);
        b5.setOnClickListener(cl);
        b6.setOnClickListener(cl);
        b7.setOnClickListener(cl);
        b8.setOnClickListener(cl);
        b9.setOnClickListener(cl);
        b0.setOnClickListener(cl);
        badd.setOnClickListener(cl);
        bsub.setOnClickListener(cl);
        bmul.setOnClickListener(cl);
        bdiv.setOnClickListener(cl);
        bresult.setOnClickListener(cl);
        bclear.setOnClickListener(cl);
    }
}