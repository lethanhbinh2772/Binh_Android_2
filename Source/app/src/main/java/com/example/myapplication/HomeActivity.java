package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;

public class HomeActivity extends AppCompatActivity implements Serializable {
    TextView tvName, tvPhoneNo, tvGreeting;
    ImageView tvUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        init();

    }

    void init() {
        tvName = findViewById(R.id.tv_username_profile);
        tvPhoneNo = findViewById(R.id.tv_phonenumber_profile);
        tvGreeting = findViewById(R.id.tv_greeting);
        tvUser = findViewById(R.id.ic_user_profile);

    }




    }


