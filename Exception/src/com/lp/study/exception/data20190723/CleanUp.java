package com.lp.study.exception.data20190723;

/**
 * @author mkdlp
 * 对于在构造阶段可能会抛出异常，并且要求清理的类，最安全的使用方式是使用嵌套的try子句
 */
public class CleanUp {
    public static void main(String[] args) {
        try {
            InputFile in=new InputFile("cleanUp.java");
            try {
                String s;
                int i=1;
                while ((s=in.getLine())!=null){

                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
