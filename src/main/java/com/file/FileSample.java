package com.file;

import java.io.File;
import java.util.Date;

public class FileSample {

    public static void main(String[] args){
        FileSample fs = new FileSample();
        String pathName = File.separator+"Users"+File.separator+"daseulkim"+File.separator+"Desktop"+File.separator+"godofjava"+File.separator+"text";
        fs.lastModified(pathName);
        //fs.checkFileMethods(pathName);
        //fs.makeDir(pathName);
        //fs.checkPath(pathName);
    }

    public void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName+ " last modified ="+ new Date(file.lastModified()));
    }

    public void checkPath(String pathName){
        File file = new File(pathName);
        System.out.println(pathName+ " is exists?= "+file.exists());
    }

    public void makeDir(String pathName){
        File file = new File(pathName);
        System.out.println("make " +pathName+ " result= "+file.mkdir());
    }

    public void checkFileMethods(String pathName){
        File file = new File(pathName);
        System.out.println(pathName + "is directory? = "+file.isDirectory());
        System.out.println(pathName + "is file? = "+file.isFile());
        System.out.println(pathName + "is hidden? = "+file.isHidden());
        System.out.println(pathName + "can read? = "+file.canRead());
        System.out.println(pathName + "can write? = "+file.canWrite());
        System.out.println(pathName + "can excute? = "+file.canExecute());
    }

}
