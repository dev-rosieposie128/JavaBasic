package com.file;

import java.io.File;
import java.io.FileFilter;

public class JPGFilter implements FileFilter {

    @Override
    public boolean accept(File file) {

        if(file.isFile()){
            String fileName = file.getName();
            if(fileName.endsWith(".jpeg") || fileName.endsWith(".jpg") ) return true;
        }
        return false;
    }
}
