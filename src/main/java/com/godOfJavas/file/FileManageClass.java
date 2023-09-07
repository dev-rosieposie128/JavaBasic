package com.godOfJavas.file;

import java.io.File;
import java.io.IOException;

public class FileManageClass {

    public static void main(String args[]){
        FileManageClass fnc = new FileManageClass();
        String pathName = File.separator+"Users"+File.separator+"daseulkim"+File.separator+"Desktop"+File.separator+"godofjava"+File.separator+"text";
        String fileName = "test.txt";

        fnc.checkFile(pathName, fileName);
    }
    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);

        try{
            System.out.println("create result = "+ file.createNewFile());
            getFileInfo(file);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void getFileInfo(File file) throws IOException {
        System.out.println("absolute path ="+file.getAbsolutePath());
        System.out.println("absolute file ="+file.getAbsoluteFile());
        System.out.println("canonical path ="+file.getCanonicalPath());
        System.out.println("canonical file ="+file.getCanonicalFile());

        System.out.println("name ="+file.getName());
        System.out.println("path ="+file.getPath());
        System.out.println("parent ="+file.getParent());
    }
}
