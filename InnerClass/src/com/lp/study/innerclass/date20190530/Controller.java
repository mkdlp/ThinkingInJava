package com.lp.study.innerclass.date20190530;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mkdlp
 * 内部类作为控制框架的设计关键:使变化的事物与不变的事物相互分离
 * 内部类可以做到:
 * (1)控制框架的完整实现是由单个类的创建，从而使得实现的细节被封装起来。内部类用来表示解决
 *问题所必需的各个不同的action()
 * (2)内部类能够很容易地访问外围类的任意成员，所以可以避免这种实现变得笨拙。
 */
public class Controller {
    private List<Event> eventList=new ArrayList<Event>();

    public void addEvent(Event c){
        eventList.add(c);
    }

    public void run(){
        while(eventList.size()>0){
            for(Event e:eventList){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
