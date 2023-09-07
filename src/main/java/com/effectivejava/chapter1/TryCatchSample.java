package com.effectivejava.chapter1;

import java.io.*;

public class TryCatchSample {

    public static void main(String [] args) throws IOException {
        TryCatchSample tcs = new TryCatchSample();
        tcs.copy("test1", "test2");
    }

    static void copy(String src, String dst) throws IOException {

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst);){

            byte[] buf = new byte[10];
            int n;
            while((n=in.read(buf)) >= 0)
                out.write(buf,0,n);
        }
    }
    /*
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);

        try{
            OutputStream out = new FileOutputStream(dst);
            try{
               byte[] buf = new byte[10];
               int n;
               while((n=in.read(buf)) >= 0)
                   out.write(buf,0,n);
            }finally {
                out.close();
            }
        }finally {
            in.close();
        }
    }*/
}
