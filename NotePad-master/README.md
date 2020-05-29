# 期中实验
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

**(7)实现结果**

![image](https://github.com/newass001/Android/blob/master/ScreenShots/qizhongres(1).jpg)



