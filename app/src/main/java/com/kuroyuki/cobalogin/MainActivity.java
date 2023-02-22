package com.kuroyuki.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvsesi;
    private Button btnLogin;

    KendaliLogin KL = new KendaliLogin();
    public static String keySPusername = "mudamudamuda==_username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(KL.isLogin(MainActivity.this, keySPusername) == true){
            setContentView(R.layout.activity_main);

            tvsesi = findViewById(R.id.et_xxx);
            btnLogin = findViewById(R.id.btn_login);
        }

        else{
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }



    }
}