package com.example.appstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class Test2Activity extends AppCompatActivity {
    ImageView imgvR, imgvP, imgvS;
    CheckBox chbR, chbP, chbS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        imgvR = findViewById(R.id.img_R);
        imgvP = findViewById(R.id.img_P);
        imgvS = findViewById(R.id.img_S);

        chbR = findViewById(R.id.chb_R);
        chbP = findViewById(R.id.chb_P);
        chbS = findViewById(R.id.chb_S);

        chbS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chbS.isChecked()){
                    imgvS.setVisibility(View.VISIBLE);
                }
                else{
                    imgvS.setVisibility(View.GONE);
                }
            }
        });

        chbR.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chbR.isChecked()){
                    imgvR.setVisibility(View.VISIBLE);
                }
                else{
                    imgvR.setVisibility(View.GONE);
                }
            }
        });

        chbP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chbP.isChecked()) {
                    imgvP.setVisibility(View.VISIBLE);
                }
                else{
                    imgvP.setVisibility(View.GONE);
                }
            }
        });
    }
}