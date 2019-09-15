package com.mkdlp.generic.date20190913;

import com.mkdlp.generic.util.date20190902.TwoTuple;
import com.mkdlp.generic.util.date20190902.ThreeTuple;
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return Tuple.tuple("hi",47);
    }

    static TwoTuple f2(){
        return Tuple.tuple("hi",47);
    }


    static ThreeTuple<String,String,Integer> h(){
        return Tuple.tuple("hi","hi",47);
    }


    static TwoTuple<String,Integer> k(){
        return Tuple.tuple("hi",47);
    }
}
