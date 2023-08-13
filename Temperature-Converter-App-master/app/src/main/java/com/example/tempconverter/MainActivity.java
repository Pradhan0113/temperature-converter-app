package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ans;
    EditText getVal;
    TextView showAns;
    RadioButton c2f, f2c;
    Double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=findViewById(R.id.ans);
        getVal=findViewById(R.id.getVal);
        showAns=findViewById(R.id.showAns);
        c2f=findViewById(R.id.c2f);
        f2c=findViewById(R.id.f2c);

        ans.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               if(getVal.getText().toString().isEmpty()){
                   showAns.setText("Enter some value !!");
               }
               else{
                   x=Double.parseDouble(String.valueOf(getVal.getText()));
                   if(c2f.isChecked()){
                       x=(x*9)/5+32;

                       showAns.setText(String.valueOf(String.format("%.2f",x))+" Degree F");
                   }
                   else if (f2c.isChecked()) {
                       x=(x-32)*5/9;
                       showAns.setText(String.valueOf(String.format("%.2f",x))+" Degree C");
                   }
               }
           }
        });

    }
}