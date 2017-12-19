package com.example.asus.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ASUS on 19-Dec-17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        TextView tvUsername =(TextView) findViewById(R.id.tvUsername);
        String username = getIntent().getStringExtra("username");
        tvUsername.setText(username);
    }
}
