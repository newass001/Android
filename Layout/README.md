# 实验二
* 题一
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test2(1).jpg)

**解题思路**

本题的重点就是线性布局的嵌套，整体最外层是一个垂直的线性布局，然后里面嵌套水平的线性布局。
边框通过一个shape.xml文件实现,下面给出shape.xml代码
```
<?xml version="1.0" encoding="utf-8"?><!-- shape定义形状，shape="rectangle"表示形状为长方形 -->
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!-- 设置框内填充颜色 -->
    <solid android:color="@android:color/black" />
    <!-- 设置边框宽度和颜色 -->
    <stroke
        android:width="1dp"
        android:color="@android:color/white" />
    <!--设置边距-->
    <padding
        android:bottom="5dp"
        android:left="5dp"
        android:right="5dp"
        android:top="5dp" />
</shape>
```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test2(4).jpg)

<br>
<br>

* 题二
![image](https://github.com/newass001/Android/blob/master/ScreenShots/test2(2).jpg)

**解题思路**

通过约束来对齐各个组件

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test2(5).jpg)

<br>
<br>


* 题三

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test2(3).jpg)

**解题思路**

通过view组件来实现分隔线，只需指定layout_height(分隔线厚度)与background(分隔线颜色)
下面给出view组件代码
```
    <View
        android:layout_height="2dip"
        android:background="#FF909090" />
```

**运行截图**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/test2(6).jpg)

