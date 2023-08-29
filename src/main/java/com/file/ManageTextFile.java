package com.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Scanner;

public class ManageTextFile {

    public static void main(String[] args){
        ManageTextFile mtf = new ManageTextFile();
        int numberCount = 10;
        String fullPath = File.separator+"Users"+File.separator+"daseulkim"+File.separator+"Desktop"+File.separator+"godofjava"+File.separator+"text"+File.separator+"numbers.txt";
        mtf.readFileWithReadAllBytes(fullPath);
        //mtf.readFileWithScanner(fullPath);
        //mtf.writeFile(fullPath, numberCount);
        //mtf.readFile(fullPath);
    }

    public void writeFile(String fileName, int numberCount){

        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter = null;

        try{
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            for(int loop=0; loop<=numberCount; loop++){
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
            System.out.println("write success!!");

        }catch (IOException ioe) {
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedWriter != null){
                try{
                    bufferedWriter.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }

    public void readFile(String fileName){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while((data = bufferedReader.readLine()) != null){
                System.out.println(data);
            }
            System.out.println(data);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedReader != null){
                try{
                    bufferedReader.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if(fileReader != null){
                try{
                    fileReader.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
    public void readFileWithScanner(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            System.out.println("read success");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public void readFileWithReadAllBytes(String fileName) {
        try {
            String data = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println(data);
            System.out.println("read success");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
