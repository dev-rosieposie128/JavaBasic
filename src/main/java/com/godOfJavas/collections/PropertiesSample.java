package com.godOfJavas.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

    public static void main(String[] args){
        PropertiesSample sample = new PropertiesSample();
        //sample.checkProperties();
        sample.saveAndLoadProperties();
        //sample.saveAndLoadPropertiesXML();
    }
    public void checkProperties(){
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object tempObject : keySet){
            System.out.println(tempObject+"="+prop.get(tempObject));
        }
    }

    public void saveAndLoadProperties(){
        try{
            String filename = "test.properties";
            File propertiesFile = new File(filename);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "daseul, kim");
            prop.setProperty("WriterHome", "http://www.GodOfJava.com");
            prop.store(fos, "Basic Properties file");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.load(fis);
            fis.close();
            System.out.println(propLoaded);
        }catch (Exception e) {
           e.printStackTrace();
        }
    }

    public void saveAndLoadPropertiesXML(){
        try{
            String filename = "test.xml";
            File propertiesFile = new File(filename);
            FileOutputStream fos = new FileOutputStream(propertiesFile);
            Properties prop = new Properties();
            prop.setProperty("Writer", "daseul, kim");
            prop.setProperty("WriterHome", "http://www.GodOfJava.com");
            prop.storeToXML(fos, "Basic XML Properties file");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis);
            System.out.println(propLoaded);
            fis.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
