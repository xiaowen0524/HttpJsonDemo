package com.bawei.asus.httpjsondemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus on 2016/11/4.
 */
public class MyBaseAdapter extends BaseAdapter {
    private List<Tugou> list;
    private Context context;

    public MyBaseAdapter(List<Tugou> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Vhodler vh;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item, null);
            vh = new Vhodler();
            vh.tv = (TextView) convertView.findViewById(R.id.tv);
            vh.name = (TextView) convertView.findViewById(R.id.name);
            vh.food = (TextView) convertView.findViewById(R.id.food);
            vh.keywords = (TextView) convertView.findViewById(R.id.keywords);
            vh.img = (ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(vh);
        } else {
            vh = (Vhodler) convertView.getTag();
        }
        vh.tv.setText(list.get(position).getDescription());
        vh.name.setText(list.get(position).getName());
        vh.food.setText(list.get(position).getFood());
        vh.keywords.setText(list.get(position).getKeywords());
//        ImageLoader loader = ImageLoader.getInstance();
//        loader.displayImage(list.get(position).getImg(), vh.img);
        return convertView;
    }

    class Vhodler {
        TextView tv, name, food, keywords;
        ImageView img;
    }
}
