package com.lp.study.innerclass.date20190510;

public class TestParcel{
    public static void main(String[] args) {
        Parcel4 p=new Parcel4();
        Contents c=p.contents();
        Destination d=p.destination("mkdlp");
//      这样是访问不到private的内部类的
//      Parcel4.PContents pc=p.new PContents();
    }
}