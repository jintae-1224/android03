package com.example.appstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btWidgetText;
    Button btTest1;
    Button btTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btWidgetText = findViewById(R.id.btn_WidgetText);
        btTest1 = findViewById(R.id.btn_Test1);
        btTest2 = findViewById(R.id.btn_Test2);

        btWidgetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, WidgetTestActivity.class);
                startActivity(mIntent);
            }
        });

        btTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, Test1Activity.class);
                startActivity(mIntent);
            }
        });

        btTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(MainActivity.this, Test2Activity.class);
                startActivity(mIntent);
            }
        });
    }
}