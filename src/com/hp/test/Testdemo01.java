package com.hp.test;

import java.io.File;

/*
* 遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件.
* */
public class Testdemo01 {
    public static void main(String[] args) {
            File file = new File("E:\\shixun");
            getFile(file);

        }
        private static void getFile (File aa){
            File[] files = aa.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {//如果是目录就继续遍历
                        getFile(file);
                    } else { //否则就判断是否是文件
                        if (file.getName().endsWith(".java")) { //判断是否以class结尾
                            System.out.println(file.getAbsolutePath());//获取文件路径
                        }
                    }
                }
            }
        }
    }

