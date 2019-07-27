package com.lp.study.exception;

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

public class FullConstructors{

    public static void f() throws MyException{
        System.out.println("Throw Myexception from f");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throw Myexception from g");
        throw new MyException("Originated in g");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            //打印方法调用处直到异常抛出的调用序列
            //加上参数System.out捕获会显示在输出里
            //不加参数将会输出到标准错误流
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
