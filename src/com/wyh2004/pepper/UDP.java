package com.wyh2004.pepper;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("请输入UDP广播内容:");
            String input = Main.userInput();
            broadcast(input);
        }
    }

    public static void broadcast(String s) throws IOException {
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10024;
        byte[] data = s.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
    }
}
