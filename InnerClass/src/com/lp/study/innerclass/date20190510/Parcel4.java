package com.lp.study.innerclass.date20190510;

public class Parcel4 {

    //private的内部类除了外部类没人能访问到他
    private class PContents implements Contents{
        private int i=11;
        @Override
        public int value() {
            return i;
        }
    }

    //protected为同包的类子类及其外部类可以访问到
    protected class PDestination implements Destination{

        private String label;

        private PDestination(String whereTo){
            label=whereTo;
        }

        @Override
        public String readLaber() {
            return label;
        }
    }

    public Destination destination(String whereTo){
        return new PDestination(whereTo);
    }
    public Contents contents(){
        return new PContents();
    }


}
