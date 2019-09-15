package com.mkdlp.generic.util;

import com.mkdlp.generic.date20190908.coffe.Coffee;
import com.mkdlp.generic.date20190908.coffe.CoffeeGenerator;
import com.mkdlp.generic.date20190908.Fibonacci ;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for(Coffee cof:coffee){
            System.out.println(cof);
        }
        Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),12);
        for(Integer i:fnumbers){
            System.out.println(i);
        }
    }
}
