package com.example.dell.edittextexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText1,editText2;
    private Button add,sub,mul,div;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    private void initView() {

        editText1=findViewById(R.id.num1Id);
        editText2=findViewById(R.id.num2Id);
        add=findViewById(R.id.addId);
        sub=findViewById(R.id.subId);
        mul=findViewById(R.id.mulId);
        div=findViewById(R.id.divId);
        textView=findViewById(R.id.resultId);
    }



    @Override
    public void onClick(View v) {
        String number1=editText1.getText().toString();
        String number2=editText2.getText().toString();

        Double num1= Double.parseDouble(number1);
        Double num2= Double.parseDouble(number2);

        if(v.getId()==R.id.addId)
        {
            Double sum= num1 + num2;
            textView.setText("Result : "+ sum);
        }

        else if(v.getId()==R.id.subId)
        {
            Double sub= num1 - num2;
            textView.setText("Result : "+ sub);
        }
        else if(v.getId()==R.id.mulId)
        {
            Double mul= num1 * num2;
            textView.setText("Result : "+ mul);
        }
        else if(v.getId()==R.id.divId)
        {
            Double div= num1 / num2;
            textView.setText("Result : "+ div);
        }


    }
}
