package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int FONT_10 = 1;
    final int FONT_16 = 2;
    final int FONT_20 = 3;
    final int plain_item = 4;
    final int FONT_red = 5;
    final int FONT_black = 6;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edittext);

    }

    @Override
    //创建选项菜单
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu fontmenu = menu.addSubMenu("字体菜单");
        fontmenu.setHeaderTitle("请选择字体大小");
        fontmenu.add(0, FONT_10, 0, "10号字体");
        fontmenu.add(0, FONT_16, 0, "16号字体");
        fontmenu.add(0, FONT_20, 0, "20号字体");

        menu.add(0, plain_item, 0, "普通菜单项");

        SubMenu colormenu = menu.addSubMenu("字体颜色");
        colormenu.setHeaderTitle("请选择字体颜色");
        colormenu.add(0, FONT_red, 0, "红色");
        colormenu.add(0, FONT_black, 0, "黑色");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    //选项菜单的菜单项被单击后的回调方法
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case FONT_10:
                editText.setTextSize(10 * 2);
                break;
            case FONT_16:
                editText.setTextSize(16 * 2);
                break;
            case FONT_20:
                editText.setTextSize(20 * 2);
                break;
            case plain_item:
                Toast toast = Toast.makeText(this, "您单击了普通项菜单", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case FONT_red:
                editText.setTextColor(Color.RED);
                break;
            case FONT_black:
                editText.setTextColor(Color.BLACK);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
