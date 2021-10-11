package com.example.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubbActivity extends AppCompatActivity {

    Button btActvC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subb);

        btActvC = findViewById(R.id.btn_ActvC);
        btActvC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyIntent = new Intent(SubbActivity.this, SubcActivity.class);
                startActivity(MyIntent);
            }
        });
    }
}