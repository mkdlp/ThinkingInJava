package com.lp.study.exception.date20190727;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author mkdlp
 */
class WrapCheckedException{
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException();
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception{

}

public class TurnOffChecking{
    public static void main(String[] args) {
        WrapCheckedException wce=new WrapCheckedException();
        wce.throwRuntimeException(3);
        for (int i=0;i<4;i++){
            try {
                if(i<3){
                    wce.throwRuntimeException(i);
                }else{
                    throw new SomeOtherException();
                }
            }catch (SomeOtherException e) {
                System.out.println("SomeOtherException: "+e);
            } catch (RuntimeException e) {
                try {
                    throw e.getCause();
                } catch (FileNotFoundException f) {
                    System.out.println("FileNotFoundException: "+f);
                }catch (IOException io) {
                    System.out.println("IOException: "+io);
                }catch (Throwable t) {
                    System.out.println("Throwable: "+t);
                }
            }
        }

    }
}