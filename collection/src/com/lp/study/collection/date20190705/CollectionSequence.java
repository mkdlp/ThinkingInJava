package com.lp.study.collection.date20190705;

import com.lp.study.collection.date20190620.pets.Pet;
import com.lp.study.collection.date20190620.pets.Pets;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * @author mkdlp
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets= Pets.createArray(8);

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index=0;
            @Override
            public boolean hasNext() {

                return index<pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c=new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
