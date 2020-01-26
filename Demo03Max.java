package cn.sust.study.day04.demo02;
/*
找到三个数最大了一个
 */

import java.util.Scanner;

public class Demo03Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(max(num1,num2,num3));
    }
    public static int max(int a,int b,int c){
        return a>(b>c?b:c)?a:(b>c?b:c);
    }
}
