package com.lp.study.collection.date20190620;

import java.util.*;

/**
 * @author mkdlp
 * Collection addAll
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts={6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        List<Integer> list=Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        //这里会报错
        //原因：Arrays.asList()返回的LIST并不是java.util.ArrayList,
        //他是返回的Arrays的内部类ArrayList,他和java.util.ArrayList一样都继承了AbstractList
        //AbstractList执行add,remove的时候默认报UnsupportedOperationException并且无任何操作
        //java.util.ArrayList对add,remove进行了重写而java.util.Arrays$ArrayList没有重写add和remove所以报错
        //----->  list.add(21);
        //----->  list.remove(1);
    }
}
