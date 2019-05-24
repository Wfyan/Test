package com.test.www.login;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {
    private int resourceId;
    //创建适配器构造方法
    public RoomAdapter(Context context, int textViewResourceId, List<Room> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }
    //重写
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Room room = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView image1 = (ImageView)view.findViewById(R.id.user_image);
        ImageView image2 = (ImageView)view.findViewById(R.id.user_image1);
        TextView name1 = (TextView)view.findViewById(R.id.user_name);
        TextView name2 = (TextView)view.findViewById(R.id.user_name1);

        image1.setImageResource(room.getUser1().getImageId());
        image2.setImageResource(room.getUser2().getImageId());
        name1.setText(room.getUser1().getName());
        name2.setText(room.getUser2().getName());

        image1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("image1");
                Intent intent = new Intent(getContext(),DataActivity.class);
                intent.putExtra("position",position+"-1");
                System.out.println(position+"-1");
                getContext().startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("image2");
                Intent intent = new Intent(getContext(),DataActivity.class);
                intent.putExtra("position",position+"-2");
                getContext().startActivity(intent);
            }
        });
        return view;
    }


}
