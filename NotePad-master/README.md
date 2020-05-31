# 期中实验
---
## 一、NoteList中显示条目增加时间戳显示

**(1)修改布局文件noteslist_item.xml,增加一个textview并加上整体布局**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(1).jpg)
---
<br>

**(2)在NoteList.java中设置多投影一列NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE的内容来当时间戳**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(2).jpg)
---
<br>

**(3)在NoteList.java中的dataColumns与viewIDs数组中各增加一个元素**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(3).jpg)
---
<br>

**(4)在NoteEditor.java中的updateNote函数中将更新的时间通过SimpleDateFormat格式化后再存入**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(4).jpg)
---
<br>

**(5)在NotePadProvider.java中的onCreate函数中将COLUMN_NAME_MODIFICATION_DATE列的数据类型修改为TEXT(不改好像也不影响功能= =)**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(5).jpg)
---
<br>

**(6)修改与modificationtime相关的内容,例如NotePadProvider.java中的如下部分**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(6).jpg)
---
<br>

**(7)实现效果(后续有修改时间戳格式，因为涉及到排序问题，请在题二(1)中查看，懒得重新编辑上半部分文档了)**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhongres(1).jpg)
---
<br>


## 二、笔记查询功能

**(1)再次修改布局文件notelist_item.xml,使用线性布局嵌套，实现每一个条目比之前多显示一个图标的界面，看起来更美观一些**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(8).jpg)

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(7).jpg)

**↑可以看见时间戳显示格式与题一中不同，因为涉及到按时间戳排序的问题，所以修改了时间戳的格式**
---
<br>

**(2)在drawable文件夹下新建一个edittext_shape.xml文件作为搜索框的样式文件，让搜索框好看一些,实现效果是一个灰色背景的圆角矩形框**
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    <!-- 设置框内填充颜色,若想设置为为透明背景色可用@android:color/transparent -->
    <solid android:color="#C8C4C4" />
    <!-- 设置框四周的弧度 -->
    <corners android:radius="20dp" />
    <!-- 设置边框高度和颜色 -->
    <stroke
        android:width="1dp"
        android:color="#BDC7D8" />
    <!--设置边距,因为边框四周有弧度，不设置边距的话，框中字体会碰到边框，不美观-->
    <padding
        android:bottom="5dp"
        android:left="5dp"
        android:right="5dp"
        android:top="5dp" />
</shape>
```
---
<br>

**(3)新建一个noteslist_view.xml文件作为自定义的listview布局文件，因为要把搜索框放到这个界面里，所以需要手动写一个布局文件。
因为使用了继承自ListActivity的getListView方法来获取布局，所以布局中的listview的id要注意设置为@android:id/list,不然会找不到这个        listview**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(9).jpg)

**搜索框样式**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(12).jpg)
---
<br>

**(4)编辑NoteList.java文件,在onCreate方法中用setContentView()指定上面步骤(2)创建的自定义布局文件,并为搜索框添加监听，以实现实时搜索的效果,非常人性化,不需要每次搜索都手动去点按搜索键**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(10).jpg)
---
<br>

**(5)实现onSearch方法,设置通配符%来实现模糊搜索,重新定义与设置Adapter来实现搜索结果的显示**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(11).jpg)
---
<br>

**(6)功能展示**

①总体布局展示

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(13).jpg)
---

②搜索功能展示

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(14).jpg)

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(15).jpg)

**若搜索框中内容为空，则会显示全部内容**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhong(16).jpg)
---
<br>

