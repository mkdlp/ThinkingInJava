package com.mkdlp.generic.date20190909;//: generics/TupleTest2.java

public class TupleTest2 {
  static TwoTuple<String,Integer> f() {
    return Tuple.tuple("hi", 47);
  }
  static TwoTuple f2() { return Tuple.tuple("hi", 47); }
  public static void main(String[] args) {
    TwoTuple<String,Integer> ttsi = f();

    testTuple.test(ttsi);
//    testTuple.test(f2());
  }
} /* Output: (80% match)
(hi, 47)
(hi, 47)
(Amphibian@7d772e, hi, 47)
(Vehicle@757aef, Amphibian@d9f9c3, hi, 47)
(Vehicle@1a46e30, Amphibian@3e25a5, hi, 47, 11.1)
*///:~
class testTuple{
  static void test(TwoTuple<String,Integer> ttsi){
    System.out.println(ttsi);
  }
}