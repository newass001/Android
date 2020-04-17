package com.example.uicomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private String[] name = new String[]{"Lion", "Tiger", "Monkey", "Dog", "Cat", "Elephant"};
    private int[] image = new int[]{R.drawable.lion, R.drawable.tiger, R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建一个List集合,集合的元素是Map
        List<Map<String, Object>> listitems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < name.length; i++) {//每一个HashMap保存一行的数据（一个name,一个image）
            Map<String, Object> listitem = new HashMap<String, Object>();
            listitem.put("name", name[i]);
            listitem.put("image", image[i]);
            listitems.add(listitem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listitems, R.layout.simple_item,
                new String[]{"name", "image"},
                new int[]{R.id.name, R.id.image});
        ListView listView = (ListView) findViewById(R.id.listview);
        //为ListView设置Adapter
        listView.setAdapter(simpleAdapter);

        //使用Toast显示被选中的列表项的信息
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {   //匿名内部类
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast toast = Toast.makeText(MainActivity.this,name[i],Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        });


    }
}
