package BaiTap.BaiTap8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//        user[][] users = new user[][]{{1, "name","123456",10000000},{2, name,"123467",5000000}};


        ATM[] atms = new ATM[]{new ATM(1, "hung", "123456", 10000000), new ATM(2, "hieu", "123467", 5000000)};

        Scanner s = new Scanner(System.in);

        System.out.print("Nhap Id: ");
        int id = s.nextInt();

        System.out.print("Nhap Pass: ");
        String pass = s.next();

        int check = -1;


        for (int i = 0; i < atms.length; i++) {
            if (atms[i].logIn(id, pass)) {
                check = i;
            }

            if (check != -1) {
                System.out.print("welcome 1, Rút tiền -> nhập số tiền: ");
                float money = s.nextFloat();
                if (atms[i].checkMoney(money)) {
                    System.out.println("gud bye , see you later");
                    break;
                } else {
                    System.out.println("So Tien Khong du");
                    break;
                }
            }

        }
        if(check == -1){
            System.out.println("Loi dang Nhap");
        }



    }
}
