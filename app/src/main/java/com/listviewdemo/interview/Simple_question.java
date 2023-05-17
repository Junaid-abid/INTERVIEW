package com.listviewdemo.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Simple_question extends AppCompatActivity {
String [] simple_question,simple_answer;
ImageButton b1,b3;
Button b2;
TextView question, answer,t3;
int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_question);

simple_question=getResources().getStringArray(R.array.simple_question);
simple_answer=getResources().getStringArray(R.array.simple_question_answer);
b1=findViewById(R.id.b1);
b2=findViewById(R.id.b2);
b3=findViewById(R.id.b3);
question=findViewById(R.id.t1);
answer=findViewById(R.id.t2);
t3=findViewById(R.id.t3);
        index=0;

        question.setText(simple_question[index]);
        b1.setEnabled(false);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(simple_answer[index]);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<9){
                    b1.setEnabled(true);
                    index++;
                    question.setText(simple_question[index]);
                    t3.setText(String.valueOf(index+1));
                    answer.setText("Answer");}
                else{
                    b2.setEnabled(false);
                }


            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<9){
                    b2.setEnabled(true);
                }
                if(index>0) {
                    index--;
                    question.setText(simple_question[index]);
                    t3.setText(String.valueOf(index+1));
                    answer.setText("Answer");
                }
                else{
                    b1.setEnabled(false);
                }
            }
        });


    }
}