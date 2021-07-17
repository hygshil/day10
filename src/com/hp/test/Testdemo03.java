package com.hp.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
*  使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒
	时间是动态的...
* */
public class Testdemo03 {
    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

    }

}
// 通过继承Thread类 来重写run方法
class MyThread extends Thread {
    //通过正则式来设置输出的时间格式
    SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");

    //重写run()方法
    public void run() {
        while (true) {
            Date date = new Date();
            String str = s.format(date);
            System.out.println(str);
            try {
                //间隔时间1秒输出一次
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
