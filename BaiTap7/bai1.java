package BaiTap.BaiTap7;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhâp A: ");
        int a = s.nextInt();
        System.out.print("Nhâp B: ");
        int b = s.nextInt();
        System.out.print("Nhâp C: ");
        int c = s.nextInt();

        System.out.println("Tổng : A + B + C = "+ (a+b+c));


        if(a > c && a>b){
            System.out.println("Số lớn nhất là A: "+ a);
        }
        else if(b > a && b > c){
            System.out.println("Số lớn nhất là B: "+ b);
        }
        else{
            System.out.println("Số lớn nhất là C: "+ c);
        }
    }
}

