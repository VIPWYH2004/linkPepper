package com.wyh2004.pepper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.官方SDK通讯方案");
        System.out.println("2.UDP广播方案(需程序支持)");
        System.out.println("3.官方SDK异步连接多台机器人通讯");
        System.out.print("请输入您的选择: ");
        try {
            int i = Integer.parseInt(userInput());
            if (i == 1){
                SDK.main(args);
            }else if (i == 2){
                UDP.main(args);
            }else if (i == 3){
                System.out.println("我还没开发好...");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return;
    }

    public static String userInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
