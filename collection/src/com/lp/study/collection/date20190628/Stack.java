package com.lp.study.collection.date20190628;

import java.util.LinkedList;

/**
 * @author mkdlp
 * 栈是一种“先进后出的容器”,用LinkedList来实现一个"栈"
 * @param <T>
 */
public class Stack<T> {
    private LinkedList<T> storage=new LinkedList<T>();
    public void push(T e){
        storage.addFirst(e);
    }
    public T peek(){
        return storage.getFirst();
    }
    public T pop(){
        return storage.removeFirst();
    }
    public boolean empty(){
        return storage.isEmpty();
    }
    public String toString(){
        return storage.toString();
    }
}
