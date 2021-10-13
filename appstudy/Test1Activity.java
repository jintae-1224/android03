package com.example.appstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Test1Activity extends AppCompatActivity {


    EditText edNo1;
    EditText edNo2;
    Button btCalcu;
    TextView tvResult;
    EditText edTest;
    EditText edCheck;
    Button btTest;
    TextView tvTest;

    RadioButton rbMinus, rbMulti, rbDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        edNo1 = findViewById(R.id.edit_No1);
        edNo2 = findViewById(R.id.edit_No2);
        btCalcu = findViewById(R.id.btn_Calcu);
        tvResult = findViewById(R.id.tv_Result);
        edCheck = findViewById(R.id.edit_Check);
        edTest = findViewById(R.id.edit_Test);
        btTest = findViewById(R.id.btn_Test);
        tvTest = findViewById(R.id.tv_Test);
        rbMinus = findViewById(R.id.rb_Minus);
        rbMulti = findViewById(R.id.rb_Multi);
        rbDiv = findViewById(R.id.rb_Div);


        rbMinus.setChecked(false);

        String sTemp = tvTest.getText().toString();
        edTest.setText(sTemp);

        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sTest = edTest.getText().toString();
                tvTest.setText(sTest);
                String sCheck = edCheck.getText().toString();

                if(sTest.equals(sCheck)){
                    tvTest.setText("같음");
                }
                else{
                    tvTest.setText("다름");
                }
            }
        });

        btCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNo1 = edNo1.getText().toString();
                String sNo2 = edNo2.getText().toString();

                int nNo1 = Integer.parseInt(sNo1); // 문자를 숫자로 변경
                int nNo2 = Integer.parseInt(sNo2);
                int nResult = 0;

                if(rbMinus.isChecked()){
                    nResult = nNo1 - nNo2;
                }
                else if(rbMulti.isChecked()){
                    nResult = nNo1 * nNo2;
                }
                else if(rbDiv.isChecked()){
                    nResult = nNo1 / nNo2;
                }

                tvResult.setText(nResult + ""); // 숫자를 문자로 변경

                //Integer nResult = nNo1 + nNo2;
                //tvResult.setText(nResult.toString());

            }
        });

    }
}
