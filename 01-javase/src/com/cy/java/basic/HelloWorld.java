package com.cy.java.basic;

public class HelloWorld {
    /**
     * main方法是程序解释执行的入口方法
     * @param args main方法运行时,由jvm传入的运行数据
     *
     * JVM 参数
     * -XX:+TraceClassLoading 通过此参数可以检查类的加载过程(
     *  就是将类读到内存的过程)
     */
    public static void main(String[] args) {
        //sout
        System.out.println("helloworld");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        };
        System.out.println("welcome");
    }
}
