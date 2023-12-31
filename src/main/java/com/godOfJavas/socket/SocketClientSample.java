package com.godOfJavas.socket;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args){
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }
    public void sendSocketSample() {
        for(int loop=0; loop<3; loop++){
            sendSocketData("I liked java at "+ new Date());
        }
        sendSocketData("EXIT");
    }
    public void sendSocketData(String data) {
        Socket socket = null;

        try{
            System.out.println("client:connecting");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("client:connect status="+socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("client:sent data");
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(socket!=null){
                try{
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
