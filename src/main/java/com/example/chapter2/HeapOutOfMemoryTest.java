package com.example.chapter2;

import java.util.ArrayList;

/**
 * @describe：堆内存溢出测试    -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author：Xisoo on 2020/5/10
 * @version：v1.0.0
 */
public class HeapOutOfMemoryTest {

    public static void main(String[] args) {
        ArrayList<HeapOutOfMemoryTest> list = new ArrayList<HeapOutOfMemoryTest>();
        while (true){
            list.add(new HeapOutOfMemoryTest());
        }
    }

}
