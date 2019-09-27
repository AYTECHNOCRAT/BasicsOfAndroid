package com.example.eee1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText t1,t2;
    Button b1,b2,b3,b4;
    String s1,s2;
    CheckBox ch1,ch2;
    RadioGroup rg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        ch1=findViewById(R.id.ch1);
        ch2=findViewById(R.id.ch2);
        rg1=findViewById(R.id.rg);
        s1=t1.getText().toString();
        s2=t2.getText().toString();

        // Button ClickListener
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        // Checkbox
        if(ch1.isChecked())
        {  String s=ch1.getText().toString();
            Toast.makeText(this,s,Toast.LENGTH_SHORT);

        }
        if(ch2.isChecked())
        {  String s=ch1.getText().toString();
            Toast.makeText(this,s,Toast.LENGTH_SHORT);
        }

        // RadioGroup /Radio Button
        int ii=rg1.getCheckedRadioButtonId();
        RadioButton rb=findViewById(ii);
        String ss=rb.getText().toString();
        Toast.makeText(this,ss,Toast.LENGTH_SHORT);

        //Acton Bar
        final ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Title");
        actionBar.setSubtitle("Subtitle");
        actionBar.setHideOnContentScrollEnabled(true);
        int ccode= Color.parseColor("#5ad391");
        Drawable d= new ColorDrawable(ccode);
        actionBar.setBackgroundDrawable(d);



    }

    @Override
    public void onClick(View v) {
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        switch (v.getId()){
            case R.id.b1: c=a+b;break;
            case R.id.b2: c=a-b;break;
            case R.id.b3: c=a*b;break;
            case R.id.b4: c=a/b;break;
            default:break;
        }
        String s=String.valueOf(c);
        Toast.makeText(this, "Result is "+s,Toast.LENGTH_SHORT);


    }
}
