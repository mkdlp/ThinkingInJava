package com.lp.study.exception.date20190727;

/**
 * @author mkdlp
 * @since 2019-07-27 07:50
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        }catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        }catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
        //这样就永远捕获不到sneeze异常编译器会报错
//        try {
//            throw new Sneeze();
//        } catch (  Annoyance annoyance) {
//            System.out.println("Caught Sneeze");
//        }catch (Sneeze sneeze) {
//            System.out.println("Caught Annoyance");
//        }
    }
}
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}