package com.nio;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args){
        NioDetailSample sample = new NioDetailSample();
        sample.checkBufferStatus();
        //sample.checkBuffer();
    }
    public void checkBuffer() {

        try{
            IntBuffer buffer = IntBuffer.allocate(1024);
            for(int loop=0; loop<100; loop++){
                buffer.put(loop);
            }
            System.out.println("buffer capacity="+buffer.capacity());
            System.out.println("buffer limit="+buffer.limit());
            System.out.println("buffer position="+buffer.position());
            buffer.flip();
            System.out.println("buffer fliped!!!");
            System.out.println("buffer limit="+buffer.limit());
            System.out.println("buffer positon="+buffer.position());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void checkBufferStatus(){
        try{
            IntBuffer buffer = IntBuffer.allocate(1024);
            buffer.get();
            printBufferStatus("get", buffer);
            buffer.mark();
            printBufferStatus("mark", buffer);
            buffer.get();
            printBufferStatus("get", buffer);
            buffer.reset();
            printBufferStatus("reset", buffer);
            buffer.rewind();
            printBufferStatus("rewind", buffer);
            buffer.clear();
            printBufferStatus("clear", buffer);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printBufferStatus(String job, IntBuffer buffer){
        System.out.println("buffer "+job+"!!!");
        System.out.format("buffer position=%d remaining=%d limit=%d`n", buffer.position(), buffer.remaining(), buffer.limit());
    }
}
