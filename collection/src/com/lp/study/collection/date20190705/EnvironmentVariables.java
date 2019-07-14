package com.lp.study.collection.date20190705;

import java.util.Map;

/**
 * 循环得到的系统环境变量
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

}
