package com.example.twotwo_lkolehiyo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/** @noinspection ALL*/
public class Login_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Button login_butt= findViewById(R.id.login);

        login_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Login_Page.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
