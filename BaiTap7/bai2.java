package BaiTap.BaiTap7;

import java.util.Scanner;

public class bai2 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Nhập 1 số tự nhiên: ");
        int numberCheck = s.nextInt();

        if(soNguyenTo(numberCheck)){
            System.out.printf("Số %d là số nguyên tố %n", numberCheck);
        }
        else{
            System.out.printf("Số %d không là số nguyên tố %n", numberCheck);

        }

        if(soHoanHao(numberCheck)){
            System.out.printf("Số %d là số hoàn hảo %n", numberCheck);
        }
        else{
            System.out.printf("Số %d không là số hoàn hảo %n", numberCheck);

        }

    }

    public static boolean soNguyenTo(int number){
        if(number < 2){
            return false;
        }
        else if(number == 2){
            return true;
        }
        else if(number % 2 == 0){
            return false;
        }
        else{
            for(int i = 3; i <= Math.sqrt(number); i +=2){
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }



    public static   boolean soHoanHao(int number){
        int sum = 0;
        for (int i = 1; i <= Math.ceil(number/2); i++) {
            if(number %  i == 0){
                sum+=i;
            }
        }
        return sum == number && number != 0 && number != 1;
    }
}
