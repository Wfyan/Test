package com.test.www.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_activity);

        //获取数据
        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        String password = intent.getStringExtra("password");

        TextView data = (TextView)findViewById(R.id.data_text);
        data.setText("用户名:"+name+"  密码："+password);
    }
}
