import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap11\\src\\data");

            file.mkdir();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}