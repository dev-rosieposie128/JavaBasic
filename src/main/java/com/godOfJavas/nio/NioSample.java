package com.godOfJavas.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
    public static void main(String[] args){
        NioSample ns = new NioSample();
        ns.basicWriteAndRead();
    }
    public void basicWriteAndRead() {
        String fileName = File.separator+"Users"+File.separator+"daseulkim"+File.separator+"Desktop"+File.separator+"godofjava"+File.separator+"text"+File.separator+"nio.txt";

        try{
            writeFile(fileName, "my first nio sample");
            readFile(fileName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel();   //파일을 쓰기 위하여 filechannel 객체 만들기
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData);  //bytebuffer객체 생성
        channel.write(buffer); //write 메소드에 buffer 객체 넘겨 파일에 쓰기
        channel.close();
    }

    public void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel(); // 파일을 읽기 위한 channel 객체 생성
        ByteBuffer buffer = ByteBuffer.allocate(1024);          // 데이터가 기본적으로 저장되는 크기로 지정
        channel.read(buffer);                                           // read()에 buffer객체를 넘겨 줌으로 써, 데이터를 이 버퍼에다 담으라고 알려줌
        buffer.flip();                                                  // buffer에 담겨있는 가장 앞으로 이동
        while(buffer.hasRemaining()){                                   // 데이터가 더 남아있는지 확이하면서 반복작업 수행
            System.out.print((char)buffer.get());
        }
        channel.close();
    }
}
