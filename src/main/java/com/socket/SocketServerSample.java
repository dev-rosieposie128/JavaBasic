package com.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {

    public static void main(String[] args){
        SocketServerSample sss = new SocketServerSample();
        sss.startServer();
    }

    public void startServer() {
        ServerSocket server = null;
        Socket client = null;

        try{
            // 포트 번호 9999를 이용하여 serversocket 객체 생성
            server = new ServerSocket(9999);
            while(true) {
                System.out.println("server:waiting for request");
                client = server.accept();   // 다른 원격 호출을 대기하는 상태가 되어 연결 완료시 socket 객체를 리턴하여 client 변수에 할당
                System.out.println("server:accepted");
                InputStream stream = client.getInputStream();   // 데이터를 받기 위해 InputStream 객첼ㄹ 받음.
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while ((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("recieved data" + receivedData);
                in.close();
                stream.close();
                client.close();
                if (receivedData != null && "EXIT".equals(receivedData.toString())) {
                    System.out.println("stop socketserver");
                    break;
                }
                System.out.println("-------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(server!= null){
                try{
                    server.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
