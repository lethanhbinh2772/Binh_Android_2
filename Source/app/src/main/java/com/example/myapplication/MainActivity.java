package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //xin chào
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Tạo đối tượng User

        User windsUser = new User();
        /*windsUser.id = 1;
        windsUser.setId(1);
        windsUser.phoneNumber = "0123456789";
        windsUser.profileUrl = "twitter.com/elonmusk";
        windsUser.username = "BìnhLT";*/

        windsUser.setId(1);
        windsUser.setPhoneNumber("0123456789");
        windsUser.setProfileUrl("twitter.com/elonmusk");
        windsUser.setUsername("Lê Thanh Bình");

        //Toast.makeText(this, windsUser.username, Toast.LENGTH_LONG).show();

        //Sử dụng đối tượng  mà được khai báo và khởi tạo trong XML
        /*Bước 1: gán ID cho đối tượng trong XML
          Bước 2: tạo tên mới và gán lại cho đối tượng đấy
         */
        EditText edtPhoneNumber = findViewById(R.id.edt_phone_number);
        edtPhoneNumber.setText("Elon Musk");

        TextView tvUsername = findViewById(R.id.tv_username);
        tvUsername.setText(windsUser.getUsername());
    }
}
