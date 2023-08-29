package com.serializable;

import java.io.*;

public class ManageObject {
    public static void main(String[] args){
        ManageObject manager = new ManageObject();
        String fullPath = File.separator+"Users"+File.separator+"daseulkim"+File.separator+"Desktop"+File.separator+
                            "godofjava"+File.separator+"text"+File.separator+"serial.obj";
        SerialDTO dto = new SerialDTO("GoodOfJavaBook",1, true, 100);
        //manager.saveObject(fullPath, dto);
        manager.loadObject(fullPath);
    }
    public void saveObject(String fullPath, SerialDTO dto){

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream(fullPath);   //fileOutputStream 객체 생성
            oos = new ObjectOutputStream(fos);      // 객체를 저장하기 위해 ObjectOutputStream 객체 생성. 해당 객체는 파일에 저장됨
            oos.writeObject(dto);                   // 매개변수로 넘어온 객체를 저ㄷ

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(oos!=null){
                try{
                    oos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try{
                    fos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void loadObject(String fullPath){
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try{
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            SerialDTO dto = (SerialDTO) obj;
            System.out.println(dto);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(ois!=null){
                try{
                    ois.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try{
                    fis.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
