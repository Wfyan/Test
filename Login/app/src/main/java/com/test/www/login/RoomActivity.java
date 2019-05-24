package com.test.www.login;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RoomActivity extends AppCompatActivity {
    private List<Room> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_activity);
        init();
        RoomAdapter adapter = new RoomAdapter(RoomActivity.this,R.layout.room_item,list);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    //房间列表初始化
    private void init(){
        //获取数据
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String name = preferences.getString("name",null);
        User user = new User(name,R.mipmap.battery);
        Room t = new Room(user,new User());
        list.add(t);
        for (int i=0;i<10;i++){
            Room room = new Room(new User(),new User());
            list.add(room);
        }
    }
}
