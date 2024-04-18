import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\JavaWeb\\Java1\\BaiTap\\BaiTap11\\src\\data.dat"));
            Human human = new Human();
            human.setName("Nguyen Van Hung");
            human.setAge(21);
            objectOutputStream.writeObject(human);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
