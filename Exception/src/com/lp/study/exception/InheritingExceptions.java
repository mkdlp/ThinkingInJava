package com.lp.study.exception;

/**
 * 自定义一个异常
 * @author mkdlp
 */
class SingleException extends Exception{

}

public class InheritingExceptions{
    public void f() throws SingleException{
        System.out.println("throws SingleException from void f()");
        throw new SingleException();
    }
    public static void main(String[] args) {
        InheritingExceptions sed=new InheritingExceptions();
        try {
            sed.f();
        } catch (SingleException e) {
            System.out.println("Caught it");
        }
    }
}


