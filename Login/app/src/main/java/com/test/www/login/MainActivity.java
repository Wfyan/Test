package com.test.www.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private EditText usernameText;
    private EditText passwoedText;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_activity);
        usernameText = (EditText)findViewById(R.id.login_input_name);
        passwoedText = (EditText)findViewById(R.id.login_input_password);
        image = (ImageView)findViewById(R.id.joy);
        //“登录”按钮控件
        Button login = (Button)findViewById(R.id.login_btn);
        //设置监听事件
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取数据
                String username = usernameText.getText().toString();
                String password = passwoedText.getText().toString();
                String n = image.getDrawable().toString();
                System.out.println(n);
                int img = getResources().getIdentifier(n,"mipmap",getPackageName());
                //模拟服务器传输数据（数据暂存本地）
                SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(MainActivity.this).edit();
                editor.putString("name",username);
                editor.apply();
                Intent intent = new Intent(MainActivity.this,RoomActivity.class);
                startActivity(intent);
            }
        });
    }
}
