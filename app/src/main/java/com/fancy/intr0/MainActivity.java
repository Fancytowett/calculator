package com.fancy.intr0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        txtResult=findViewById(R.id.txtResult);
    }


    public void calc(View view) {
        //collect the data
        String a=input1.getText().toString().trim();
        String b=input2.getText().toString().trim();
        if(a.isEmpty()||b.isEmpty()){
            Toast.makeText(this, "Fill in all values", Toast.LENGTH_SHORT).show();
            return;

        }

        double x=Double.parseDouble(a);
        double y=Double.parseDouble(b);

        double sum = x+y;

        txtResult.setText(sum+"");
//        String.valueOf(sum);

    }
}
