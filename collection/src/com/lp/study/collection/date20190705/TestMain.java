package com.lp.study.collection.date20190705;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        String[] strs={"luffy","ace","xiluoheihei"};
        List<String> strList=new ArrayList<String>();
        Collections.addAll(strList,strs);
        String param2=strList.get(2);
        param2="botkasd";
        System.out.println(strList);

        for(int i=0;i<strList.size();i++){
            if(i==2){
                strList.set(2,"botkasd");
            }
        }
        System.out.println(strList);

        Iterator<String> it=strList.iterator();
        int idx=0;
        while (it.hasNext()){
            if(idx==2){
                String next=it.next();
                next="xiluoheihei";
            }
            idx++;
        }
        System.out.println(strList);
    }
}
