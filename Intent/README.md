# 实验四
* 题一
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test4(1).jpg)

**核心代码

```
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        final EditText editText = findViewById(R.id.edittext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建intent
                Intent intent = new Intent();
                String data = editText.getText().toString();
                //根据指定字符串解析Uri对象
                Uri uri = Uri.parse(data);
                //为Intent设置action属性
                intent.setAction(Intent.ACTION_VIEW);
                //设置data属性
                intent.setData(uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test4(3).jpg)
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test4(4).jpg)

<br>
<br>

* 题二
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test4(2).jpg)

**解题思路**

自定义一个webview来加载URL，需要重写setWebViewClient方法，不然不会跳出选择浏览器的提示，直接使用默认浏览器了，还需注意intent-filter的设置
```
       <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <category android:name="android.intent.category.DEFAULT"/><!--category.DEFAULT一定要设置，不然在选择浏览器时看不到该应用-->
                <category android:name="android.intent.category.BROWSABLE"/>
                <data android:scheme="http" />
                <data android:scheme="https" />
            </intent-filter>
        </activity>
    </application>
    <uses-permission android:name="android.permission.INTERNET"/>
    
webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //返回值是true的时候控制WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);//将webView中的url加载出来
                return true;
            }
        });
```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test4(5).jpg)
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test4(6).jpg)

<br>
<br>


