package BaiTap.BaiTap7;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập A: ");
        float a = s.nextFloat();
        System.out.print("Nhập B: ");
        float b = s.nextFloat();
        int check;
        do{
            System.out.println("----------------Menu----------------- \n 1. Tính tổng \n 2. Tính hiệu \n 3. Tính tích \n 4. Tính thương \n 5. Thoát chương trình \n");

            System.out.print("Bạn chọn số: ");
            check = s.nextInt();
            if(check == 1) System.out.println("Tồng của A + B số là : "+ (a+b));
            else if(check == 2) System.out.println("Hiệu của A - B số là: "+ (a-b));
            else if(check == 3) System.out.println("Tích của A * B số là: "+(a*b));
            else if(check == 4) System.out.printf("Thương của A / B số là: %f \n",(a/b));
            else if (check == 5) System.out.println("Bạn đã thoát chương trình");
            else System.out.println("Vui lòng chọn trong menu");


        }while (check != 5);

    }
}
