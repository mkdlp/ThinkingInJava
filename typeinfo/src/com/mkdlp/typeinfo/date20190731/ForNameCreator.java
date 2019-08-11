package com.mkdlp.typeinfo.date20190731;

import com.mkdlp.typeinfo.pets.*;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types=new ArrayList<>();
    private static String[] typeNames= {
            "com.mkdlp.typeinfo.pets.Cat",
            "com.mkdlp.typeinfo.pets.Cymric",
            "com.mkdlp.typeinfo.pets.Dog",
            "com.mkdlp.typeinfo.pets.Hamster",
            "com.mkdlp.typeinfo.pets.Manx",
            "com.mkdlp.typeinfo.pets.Mutt",
            "com.mkdlp.typeinfo.pets.Pug"
    };

    private static void loader(){
        try {
            for(String name :typeNames){
                types.add(
                        (Class<? extends Pet>)Class.forName(name)
                );
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    static {
        loader();
    };

    public List<Class<? extends Pet>> types(){
        return types;
    }

    public static void main(String[] args) {
        ForNameCreator fc=new ForNameCreator();
        System.out.println(fc.types());
    }
}
