package com.test.www.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_activity);
        //获取数据
        String string = getIntent().getStringExtra("position");
        TextView data = (TextView)findViewById(R.id.data_text);
        data.setText("position:"+string);
    }
}
