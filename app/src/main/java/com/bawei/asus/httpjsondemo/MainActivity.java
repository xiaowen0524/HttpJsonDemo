package com.bawei.asus.httpjsondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private List<Tugou> list;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        listview = (ListView) findViewById(R.id.listview);
        hongyang();
    }
    private void hongyang() {
        String url = "http://www.tngou.net/api/cook/list";
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        OkHttpUtils.get(url, new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                final String res = response.body().string();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
//                        tv.setText(res);
                        Gson gson = new Gson();
                        Bean bean = gson.fromJson(res, Bean.class);
                        list = bean.getTugou();
                        listview.setAdapter(new MyBaseAdapter(list, MainActivity.this));
                    }

                });
            }
        });
    }


}
