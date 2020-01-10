package com.cursmysql;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket s = serverSocket.accept();
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        String line = in.readLine();
        int a= Integer.parseInt(line);
        String line2 = in.readLine();
        int b= Integer.parseInt(line2);
        String line3 = in.readLine();
        int c= Integer.parseInt(line3);

        System.out.println("mesaj->"+ (a+b+c));

    }
}
