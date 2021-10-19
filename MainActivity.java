package com.example.mytest02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ckbHp, ckbNb, ckbTotall;
    EditText editHp, editNb;
    RadioButton rdbCard, rdbMoney, rdbAccount;
    Button btOk, btReset;
    TextView tvResultAc, tvHp, tvNb, tvCash, tvTotall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ckbHp  = findViewById(R.id.ckb_Hp);
        ckbNb = findViewById(R.id.ckb_Nb);
        ckbTotall = findViewById(R.id.ckb_Totall);
        editHp = findViewById(R.id.edit_Hp);
        editNb = findViewById(R.id.edit_Nb);
        rdbCard = findViewById(R.id.rdb_Card);
        rdbMoney = findViewById(R.id.rdb_Money);
        rdbAccount = findViewById(R.id.rdb_Account);
        btOk = findViewById(R.id.btn_Ok);
        btReset = findViewById(R.id.btn_Reset);
        tvResultAc = findViewById(R.id.tv_ResultAc);
        tvHp = findViewById(R.id.tv_Hp);
        tvNb = findViewById(R.id.tv_Nb);
        tvCash = findViewById(R.id.tv_Cash);
        tvTotall = findViewById(R.id.tv_Totall);

        rdbAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rdbAccount.isChecked()){
                    tvResultAc.setVisibility(View.VISIBLE);
                    //계좌 선택시 계좌번호 나오는 이벤트
                }
            }
        });

        rdbCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rdbCard.isChecked()){
                    tvResultAc.setVisibility(View.INVISIBLE);
                }
            }
        });

        rdbMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rdbMoney.isChecked()){
                    tvResultAc.setVisibility(View.INVISIBLE);
                }
            }
        });

        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ckbHp.isChecked() && editHp.getText().toString().length() == 0){
                    Toast.makeText(MainActivity.this, "핸드폰 수량을 입력하세요", Toast.LENGTH_SHORT).show();
                    editHp.requestFocus();
                    return;
                }
                else if(ckbNb.isChecked() && editNb.getText().toString().length() == 0){
                    Toast.makeText(MainActivity.this, "노트북 수량을 입력하세요", Toast.LENGTH_SHORT).show();
                    editNb.requestFocus();
                    return;
                }
                String sHp = editHp.getText().toString();
                //int nHp = Integer.parseInt(sHp);
                tvHp.setText("핸드폰:"+ sHp + "개");
                String sNb = editNb.getText().toString();
                //int nNb = Integer.parseInt(sNb);
                tvNb.setText("노트북:"+ sNb + "개");
                if(rdbCard.isChecked()){
                    tvCash.setText("카드");
                }
                else if(rdbMoney.isChecked()){
                    tvCash.setText("현금");
                }
                else{
                    tvCash.setText("계좌");
                }
            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editHp.setText(null);
                editNb.setText(null);
                ckbHp.setChecked(false);
                ckbNb.setChecked(false);
                ckbTotall.setChecked(false);
                rdbCard.setChecked(false);
                rdbMoney.setChecked(false);
                rdbAccount.setChecked(false);
                tvHp.setText("핸드폰 :   개");
                tvNb.setText("노트북 :   개");
                tvResultAc.setText("대림대 123-4567-890");
                tvCash.setText("결재방법 : ");
                tvTotall.setText("결재금액 :   원");
            }
        });

        ckbTotall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ckbTotall.isChecked() && ckbHp.isChecked() && ckbNb.isChecked()){
                    int nHp = Integer.parseInt(editHp.getText().toString());
                    int nNb = Integer.parseInt(editNb.getText().toString());
                    int nResult = nHp*2000 + nNb*3000;
                    tvTotall.setText("결재 금액: " + nResult + "원");
                }
                else if(ckbTotall.isChecked() && ckbHp.isChecked()){
                    int nHp = Integer.parseInt(editHp.getText().toString());
                    int nResult = nHp*2000;
                    tvTotall.setText("결재 금액: " + nResult + "원");
                }
                else if(ckbTotall.isChecked() && ckbNb.isChecked()){
                    int nNb = Integer.parseInt(editNb.getText().toString());
                    int nResult = nNb*3000;
                    tvTotall.setText("결재 금액: " + nResult + "원");
                }
                else{
                    tvTotall.setText("결재 금액: 0원");
                }
            }
        });
    }
}