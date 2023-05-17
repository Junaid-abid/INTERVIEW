package com.listviewdemo.interview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class buttonselection extends AppCompatActivity {
TextView t1;
Button b1,b2,b3,b4,b5;
Intent i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonselection);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button5);
        t1=findViewById(R.id.textView);
        b3=findViewById(R.id.button6);
        b4=findViewById(R.id.button3);
        b5=findViewById(R.id.button4);
         i1=new Intent(buttonselection.this,Simple_question.class);
         i2=new Intent(buttonselection.this,tough_question.class);
        Intent i=getIntent();
        String name=i.getStringExtra("title");
        t1.setText("Welcome "+ name);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i1);
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i2);

            }
        });
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://www.google.com/maps/place/PAF+Base+Shahbaz+Jacobabad/@28.2741884,68.4630387,17z/data=!3m1!4b1!4m6!3m5!1s0x393473b778e97671:0x7ab88b234fdc2742!8m2!3d28.2741837!4d68.4652274!16zL20vMGZ2MF9n");
    }
});
b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://play.google.com/store/search?q=Interview&c=apps");
    }
});
b5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://play.google.com/store/apps/details?id=com.linkedin.android");
    }
});
    }

    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}