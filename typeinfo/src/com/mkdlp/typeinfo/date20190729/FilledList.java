package com.mkdlp.typeinfo.date20190729;
import java.util.*;

/**
 * @author mkdlp
 */
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type){
        this.type=type;
    }
    public List<T> create(int elements){
        List<T> result=new ArrayList<T>();
        for(int i=0;i<elements;i++){
            try {
                result.add(type.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl=new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(25));
    }
}
class CountedInteger{
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return Long.toString(id);
    }
}
