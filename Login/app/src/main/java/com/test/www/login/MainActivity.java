package com.test.www.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText usernameText;
    private EditText passwoedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
        usernameText = (EditText)findViewById(R.id.login_input_name);
        passwoedText = (EditText)findViewById(R.id.login_input_password);
        //“登录”按钮控件
        Button login = (Button)findViewById(R.id.login_btn);
        //设置监听事件
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取数据
                String username = usernameText.getText().toString();
                String password = passwoedText.getText().toString();
                //利用Intent传输数据
                Intent intent = new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });

    }
}
