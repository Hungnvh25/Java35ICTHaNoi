import BaiTap.BaiTap9.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Product[] listProduct = new Product[100];
        int i = 0;
        int check;
        Scanner s = new Scanner(System.in);

        do{
            System.out.println("--------------------Menu---------------------");
            System.out.println("1. Nhập thông tin sản phẩm\n" +
                    "2. Tìm sản phẩm giá cao nhất và thấp nhât\n" +
                    "3. Tìm sản phâm\n" +
                    "4. Thoát\n\n");

            System.out.print("Mời chọn menu: ");
            check = s.nextInt();

            if(check == 1){

                if(i == 100){
                    System.out.println("Số lượng sản phẩm đã đầy");
                    continue;
                }
                System.out.print("Nhập tên sản phẩm: ");
                String name = s.next();
                System.out.print("Nhập giá sản phẩm: ");
                float price = s.nextFloat();
                System.out.print("Nhập số lượng sản phẩm: ");
                int quantity = s.nextInt();

                listProduct[i] = new Product(i,name,price,quantity);
                i++;
            }
            else if (check == 2) {
                if (i == 0) {
                    System.out.println("Chưa có sản phẩm nào được thêm vào.");
                    continue;
                }
                int idMin = 0;
                int idMax = 0;

                for (int j = 0; j < i; j++) {
                    if(listProduct[j].getPrice()>listProduct[idMax].getPrice()){
                        idMax = j;
                    }
                    if(listProduct[j].getPrice()<listProduct[idMin].getPrice()){
                        idMin = j;
                    }

                }

                System.out.println("Sản phẩm có giá cao nhất là "+ listProduct[idMax].getName());
                System.out.println("Sản phẩm có giá thấp nhất là "+ listProduct[idMin].getName());

            } else if (check == 3) {
                System.out.println("Nhập tên sản phẩm : ");
                String search = s.next();

                boolean found = false;
                for(int j = 0; j < i; j++) {
                    if(listProduct[j].getName().equals(search)){
                        System.out.println("Sản phẩm được tìm thấy có name: " +listProduct[j].getName()
                                +"\n price: "+listProduct[j].getPrice()+"\n quantity: "+ listProduct[j].getQuantity());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Không tìm thấy sản phẩm nào với tên này.");
                }

            }


        }while (check != 4);


    }
}
