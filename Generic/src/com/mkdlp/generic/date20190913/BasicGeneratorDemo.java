package com.mkdlp.generic.date20190913;

import com.mkdlp.generic.util.BasicGenerator;
import com.mkdlp.generic.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountObject> gen=BasicGenerator.create(CountObject.class);
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }

        Generator<CountObject> gen2=new BasicGenerator<>(CountObject.class);
        for(int i=0;i<5;i++){
            System.out.println(gen2.next());
        }
    }
}
