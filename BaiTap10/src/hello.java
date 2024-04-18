import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

public class hello {
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileInputStream file = new FileInputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap10\\hello.txt");
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(file);
//            int i = 0;
//            while((i = bufferedInputStream.read()) != -1){
//                System.out.println((char) i);
//                System.out.println("AKinawoa");
//            }
//            file.close();
//        }
//        catch (Exception ignored){
//
//        }

//        try {
//            String content = "Hello Akina";
//            FileOutputStream file = new FileOutputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap10\\src\\hello.txt");
//            file.write(content.getBytes());
//            file.close();
//        }catch (Exception e){
//
//        }

//        try {
//            FileInputStream fileInputStream = new FileInputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap10\\src\\hello.txt");
//            FileOutputStream fileOutputStream = new FileOutputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap10\\src\\Akinawoa.txt");
//
//            int data = 0;
//            while ((data = fileInputStream.read()) != -1){
//                fileOutputStream.write(data);
//            }
//            fileInputStream.close();
//            fileOutputStream.close();
//        }catch (Exception e){
//
//        }


        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap10\\src\\hello.txt");
            int data = 0;
            String img = "";
            while ((data = fileInputStream.read()) != -1) {
                img += ((char) data);

            }

            String[] listImg = img.split("#");
            int i = 0;
            for (String item : listImg
            ) {
                URL url = new URL(item);
                BufferedInputStream bufferedStream = new BufferedInputStream(url.openStream());

                FileOutputStream fileOutputStream = new FileOutputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap10\\src\\Akinawoa" + i + ".jpg");
                data = 0;
                while ((data = bufferedStream.read()) != -1) {
                    fileOutputStream.write(data);
                }
                i++;

                fileOutputStream.close();
                bufferedStream.close();
            }


            fileInputStream.close();
        } catch (Exception e) {

        }

    }
}
