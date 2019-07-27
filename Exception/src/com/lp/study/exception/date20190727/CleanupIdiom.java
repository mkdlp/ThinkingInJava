package com.lp.study.exception.date20190727;

/**
 * @author mkdlp
 */
class NeedsCleanup{
    private static long counter=1;
    private final long id=counter++;
    public void dispose(){
        System.out.println("NeedsCleanup "+id+" disposed");
    }
}

class ConstructionException extends Exception{

}

class NeedsCleanup2 extends NeedsCleanup{
    public NeedsCleanup2() throws ConstructionException{}
}
public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1=new NeedsCleanup();
        try {
            //...
        } catch (Exception e) {
            nc1.dispose();
        }

        NeedsCleanup nc2=new NeedsCleanup();
        NeedsCleanup nc3=new NeedsCleanup();

        try {
            //...
        } catch (Exception e) {
            nc2.dispose();
            nc3.dispose();
        }

        try {
            NeedsCleanup2 nc4=new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5=new NeedsCleanup2();
                try {

                } catch (Exception e) {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            }finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }
}
