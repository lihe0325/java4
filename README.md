# 计G201 李赫 2020322061
## 实验目的  
1.掌握字符串String及其方法的使用  
2.掌握文件的读取/写入方法  
3.掌握异常处理结构 
## 业务要求  
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。  
文件A包括两部分内容：  
一是学生的基本信息；  
二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：  
 
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”  
2.允许提供输入参数，统计古诗中某个字或词出现的次数  
3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A  
4.考虑操作中可能出现的异常，在程序中设计异常处理程序  
## 实验要求 
1.设计学生类（可利用之前的）；  
2.采用交互式方式实例化某学生；  
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  
## 核心代码
```
        StringBuilder poem = Poem.poems(path);
        String content = "姓名:" + stu.getName() + "\n性别:" + stu.getGender() + "\n年龄:" + stu.getAge() + "\n\n" + poem;
        try(Writer writer = new FileWriter("C:\\Users\\dell\\Desktop\\A.txt", StandardCharsets.UTF_8)) {
            writer.write(content);
        }
        String res = Poetry.poetry(path);
        System.out.println(res);
        System.out.println("数据已成功写入A.txt文件！");
    }
}
```
调用Poem包里的poems方法，并用一个变量保存起来；调用Poetry包里的poetry方法，统计字符个数并打印出来。  
```
        for (int i = 1; i < strList.size(); i++) {
            String s = strList.get(i);
            for (int j = 0; j < s.length(); j++) {
                if (j == 7) {
                    s = s.substring(0, j) + "，" + s.substring(j, s.length()) + "。";
                }
            }
            poem.append(s + "\n");
        }
        return poem;
```
用for循环来遍历数组，做的时候测试了一下，发现索引为0的数组存储的是“[” 所以循环从索引1开始。  
然后在对s进行循环，把字符串处理成真正的古诗格式，当j等于7的时候对字符串进行处理。  
把每个处理好的字符串进行拼接，并加换行符用来换行，使之成为每14个字符为一行。  
## 实验结果
![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/ruAMsa53pVQWN7FLK88i5tEI5pNjOHVSx3Cy3U3cS4MpL6LZDPPN*f*mKfPkQIrIDAD77pm2PBsW1SzAUD9AjRq1fn0GNCM1J9MGvEbWcwY!/b&bo=DQLIAAAAAAADB.U!&rf=viewer_4)

![alt console](http://m.qpic.cn/psc?/V54cvp6h0srRYw1sRHqT4QtAdx1Tmx8H/45NBuzDIW489QBoVep5mcaXHXBmWNI.x3qzO7dOhxoh62Q1mw0JTVPvVLr.1MnOVDRuyADiOIXMcfeemGlrakPwp2P9zWaDcOkBQnj5m.DM!/b&bo=jgGtAgAAAAADFxI!&rf=viewer_4)
  
## 实验感想
通过此次实验熟练掌握了字符串String及其方法的使用，并且掌握了文件的读取和写入的方法，掌握并熟练使用异常处理结构。
