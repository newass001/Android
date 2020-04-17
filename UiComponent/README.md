# 实验三
* 题一
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(1).jpg)

**解题思路**

使用simpleadapter去填充listview,填充进去的每一个元素是一个线性水平的布局,使用listselector标签设置选中item时的背景色
```
    private String[] name = new String[]{"Lion", "Tiger", "Monkey", "Dog", "Cat", "Elephant"};
    private int[] image = new int[]{R.drawable.lion, R.drawable.tiger, R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建一个List集合,集合的元素是Map
        List<Map<String, Object>> listitems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < name.length; i++) {//每一行数据是一个HashMap
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
```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(5).jpg)

<br>
<br>

* 题二
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(2).jpg)

**解题思路**

设置一个按钮，点击按钮时调用createdialog方法去构造alertdialog,使用getLayoutInflater().inflate方法将xml文件转换为可编程的对象
```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createDialog();

            }
        });
    }

    public void createDialog() {
        TableLayout login = (TableLayout) getLayoutInflater().inflate(R.layout.activity_main, null);
        new AlertDialog.Builder(this)
                .setView(login)
                .setPositiveButton("sign in", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create()
                .show();
    }
}

```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(6).jpg)

<br>
<br>


* 题三

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(3).jpg)

**解题思路**

使用xml文件设置菜单样式，然后用MenuInflater.inflate() 扩充菜单资源（将 XML 资源转换为可编程对象）
```
    @Override
    //创建选项菜单
    public boolean onCreateOptionsMenu(Menu menu) {
        //使用XML文件定义选项菜单，并使用 MenuInflater.inflate() 扩充菜单资源（将 XML 资源转换为可编程对象）
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.custom_menu, menu);
        return true;
    }
        @Override
    //处理点击事件
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.字号10:
                editText.setTextSize(10 * 2);
                break;
            case R.id.字号16:
                editText.setTextSize(16 * 2);
                break;
            case R.id.字号20:
                editText.setTextSize(20 * 2);
                break;
            case R.id.普通菜单:
                Toast toast = Toast.makeText(this, "您单击了普通项菜单", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.红色字体:
                editText.setTextColor(Color.RED);
                break;
            case R.id.黑色字体:
                editText.setTextColor(Color.BLACK);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(7).jpg)

* 题四

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(4).jpg)

**解题思路**

本题还没怎么搞明白，暂时是直接先用老师给的参照代码


**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test3(8).jpg)

