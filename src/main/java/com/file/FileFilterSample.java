package com.file;

import java.io.File;

public class FileFilterSample {
    public static void main(String[] args){
        FileFilterSample ffs = new FileFilterSample();
        String pathName = File.separator+"Users"+File.separator+"daseulkim"+File.separator+"Desktop"+File.separator+"godofjava"+File.separator+"text";
        ffs.checkList(pathName);
    }
    private void checkList(String pathName) {
        File file;

        try {
            file = new File(pathName);
            //File []mainFileList = file.listFiles();
            //File []mainFileList = file.listFiles(new JPGFilenameFilter());
            File []mainFileList = file.listFiles(new JPGFilter());
            for(File tempFile:mainFileList){
                System.out.println(tempFile.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
