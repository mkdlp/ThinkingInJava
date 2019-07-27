package com.lp.study.exception.data20190723;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mkdlp
 * 在构造器里使用try catch
 */
public class InputFile {
    private BufferedReader in;

    public InputFile(String name) throws Exception{
        try {
            in= new BufferedReader(new FileReader("D://1.text"));
        } catch (FileNotFoundException e) {
            //当文件还没有打开的时候不用关闭流
            System.out.println("Could not open "+name);
            throw e;
        }catch (Exception e) {
            //抛出其他异常的时候再关闭流
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() unsuccessful");
            }
            throw e;
        } finally {
            //不要在这个地方关闭流,不然每新建一个对象都会执行
        }
    }
    public String getLine() {
        String s;
        try {
            s=in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch (IOException e) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
