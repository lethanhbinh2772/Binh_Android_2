package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class User extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_layout);
        init();

    }
    void init() {
        TextView edtEditInfo = findViewById(R.id.btn_edit_profile);
        LinearLayout relatReturn = findViewById(R.id.ln_logout);
        edtEditInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, InfoEdittingActivity.class);
                startActivity(intent);
            }
        });
        relatReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(User.this, LoginActivity.class);
                startActivity(intent2);
            }
        });

    }


}
