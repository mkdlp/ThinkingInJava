package com.lp.study.collection.date20190701;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author mkdlp
 *
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Set<Integer> intset=new TreeSet<>();
        for (int i=0;i<1000;i++){
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}
