package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnActvA;
    Button btnActvB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActvA = findViewById(R.id.btn_ActvA);
        btnActvB = findViewById(R.id.btn_ActvB);

        btnActvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyIntent = new Intent(MainActivity.this, SubaActivity.class);
                startActivity(MyIntent);
            }
        });

        btnActvB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyIntent = new Intent(MainActivity.this, SubbActivity.class);
                startActivity(MyIntent);
            }
        });
    }
}