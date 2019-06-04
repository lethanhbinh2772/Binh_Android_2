package com.example.myapplication.Controller.Auth;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.Model.User;
import com.example.myapplication.Controller.Main.UserActivity;
import com.example.myapplication.Util.AppConfig;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                screenRouter();
            }
        }, 2000);
    }

    void screenRouter() {
        String phoneNumber = AppConfig.getPhoneNumber(this);
        if(phoneNumber == null){
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(SplashActivity.this, UserActivity.class);
            User user ;
            user = new User();
            user.setUsername("Elon Musk");
            user.setPhoneNumber("0912840538");
            user.setProfileUrl("https://pbs.twimg.com/profile_images/1123386434226774016/mQ4Ms0jR_400x400.jpg");
            user.setId(1);
            intent.putExtra("user",user);
            startActivity(intent);
            finish();
        }
    }
}
