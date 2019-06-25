package com.lp.study.collection.date20190626;

import com.lp.study.collection.date20190620.pets.Pet;
import com.lp.study.collection.date20190620.pets.Pets;

import java.util.*;

/**
 * @author mkdlp
 * Iterator的跨容器性,迭代器统一了对容器的访问方式。
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p=it.next();
            System.out.print(p.id()+":"+p+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets= Pets.arrayList(8);
        LinkedList<Pet> petsll=new LinkedList<Pet>(pets);
        HashSet<Pet> petsHs=new HashSet<Pet>(pets);
        TreeSet<Pet> petsTs=new TreeSet<Pet>(pets);
        display(pets.iterator());
        display(petsll.iterator());
        display(petsHs.iterator());
        display(petsTs.iterator());
    }
}
