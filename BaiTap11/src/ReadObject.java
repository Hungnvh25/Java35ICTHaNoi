import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap11\\src\\data.dat"));
            Human human = (Human) objectInputStream.readObject();
            System.out.println("Name" + human.getName());
            System.out.println("Age" + human.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
