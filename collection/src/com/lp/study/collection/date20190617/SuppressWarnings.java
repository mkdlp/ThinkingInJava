package com.lp.study.collection.date20190617;

import java.util.ArrayList;

/**
 * @author mkdlp
 * SuppressWarnings注解可以用来抑制编译器产生的警告信息
 */
public class SuppressWarnings {

    @java.lang.SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++){
            apples.add(new Apple());
            apples.add(new Orange());
        }
        for(int i = 0; i < 3; i++){
            System.out.println(((Apple)apples.get(i)).id());
        }
    }
}
