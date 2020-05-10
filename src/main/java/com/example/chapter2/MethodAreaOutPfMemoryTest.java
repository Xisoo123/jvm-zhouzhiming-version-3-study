package com.example.chapter2;

import java.util.HashSet;

/**
 * @describe：方法区内存溢出测试 -Xms6m -Xmx6m
 * @author：Xisoo on 2020/5/10
 * @version：v1.0.0
 */
public class MethodAreaOutPfMemoryTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        int num = 1;
        while (true) {
            set.add(String.valueOf(num).intern());
            num++;
        }
    }


}
