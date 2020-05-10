package com.example.chapter2;

/**
 * @describe：JVM虚拟机栈内存溢出测试  -Xss128k
 * @author：Xisoo on 2020/5/10
 * @version：v1.0.0
 */
public class StackOutOfMemoryTest {

    public int num = 0;

    public void test() {
        num++;
        test();
    }

    public static void main(String[] args) {
        StackOutOfMemoryTest stack = new StackOutOfMemoryTest();
        try {
            stack.test();
        } catch (Exception e) {
            System.out.println("-----栈深度----  " + stack.num);
            e.printStackTrace();
        }
    }

}
