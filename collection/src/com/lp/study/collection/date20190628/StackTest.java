package com.lp.study.collection.date20190628;

/**
 * @author mkdlp
 * LinkedList实现stack的测试类
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        for(String s:"My dog has fleas ".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
