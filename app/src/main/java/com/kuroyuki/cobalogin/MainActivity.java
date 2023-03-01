package com.kuroyuki.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvsesi, tvName;
    private Button btnLogout;

    KendaliLogin KL = new KendaliLogin();
    public static String keySPusername = "mudamudamuda==_username";
    public static String keySPname = "mudamudamuda==_name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(KL.isLogin(MainActivity.this, keySPusername) == true){
            setContentView(R.layout.activity_main);

            tvsesi = findViewById(R.id.et_xxx);
            btnLogout = findViewById(R.id.btn_logout);
            tvName = findViewById(R.id.et_yyy);

            tvsesi.setText(KL.getPref(MainActivity.this, keySPusername));
            tvName.setText(KL.getPref(MainActivity.this, keySPname));

//            tvsesi.setText(LoginActivity.username);
            btnLogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    KL.setPref(MainActivity.this, keySPusername, null);
                    KL.setPref(MainActivity.this, keySPname, null);
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            });
        }

        else{
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }



    }
}