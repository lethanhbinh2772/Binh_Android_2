package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        init(); checkValid();
    }
    void init(){
        edtPhoneNumber = findViewById(R.id.edt_phone_number);
        RelativeLayout relatLogin = findViewById(R.id.rl_login_button);
        ImageView imgFB = findViewById(R.id.img_fb_login);
        ImageView imgGG = findViewById(R.id.img_google_login);

        relatLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Chào mừng trở lại, Bình", Toast.LENGTH_SHORT).show();
                if(checkValid()){
                    //Chuyển màn hình
                    //Tạo đối tượng intent

                    Intent intent = new Intent(LoginActivity.this, User.class);
                    startActivity(intent);

                }else{
                    //Thông báo lỗi
                    Toast.makeText(LoginActivity.this, "Vui lòng kiểm tra lại số điện thoại và thử lại", Toast.LENGTH_LONG).show();
                }
            }
        });
        imgFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Chưa hỗ trợ", Toast.LENGTH_SHORT).show();
            }
        });
        imgGG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Chưa hỗ trợ", Toast.LENGTH_SHORT).show();
            }
        });

    }
    boolean checkValid(){
        int pnbLength = edtPhoneNumber.getText().toString().length();
        return (pnbLength>9);
        /*if (pnbLength > 9)
            return true;
        return false;*/
    }
}
