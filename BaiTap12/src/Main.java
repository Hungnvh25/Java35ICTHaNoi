import model.Mark;
import model.Student;
import model.Subject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  <T> void writeObjectToFile(String filePath, ArrayList<T> list) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        outputStream.writeObject(list);
        outputStream.close();
    }

    public static  <T> ArrayList<T> readObjectFromFile(String filePath) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
        ArrayList<T> list = (ArrayList<T>) inputStream.readObject();
        inputStream.close();
        return list;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ArrayList<Mark> marks = new ArrayList<Mark>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Subject> subjects = new ArrayList<Subject>();

        String dbStudent = "D:\\JavaWeb\\Java1\\BaiTap\\BaiTap12\\src\\data\\student.txt";
        String dbMark = "D:\\JavaWeb\\Java1\\BaiTap\\BaiTap12\\src\\data\\mark.txt";
        String dbSubject = "D:\\JavaWeb\\Java1\\BaiTap\\BaiTap12\\src\\data\\subject.txt";


        int check = 0;
        int studenId = 1;
        int subjectId = 1;
        int markId = 1;
        Scanner s = new Scanner(System.in);

        do{
            System.out.println("-------------------------Menu-------------------");
            System.out.println("1.Them sinh vien \n2.Hien thi danh sach sinh vien \n3.Them mon hoc \n4.Hien thi danh sach mon hoc\n5.Nhap diem cho sinh vien \n6.Hien thi bang diem cho sinh vien\n7.Thoat chuong trinh");
            System.out.print("Mời chọn menu: ");
            check = s.nextInt();

            if(check == 1){
                System.out.print("Nhap ten Sinh Vien: ");
                String name = s.next();
                System.out.print("Nhap tuoi sinh vien: ");
                int age = s.nextInt();
                System.out.print("Nhap dia chi: ");
                String address = s.next();

                students.add(new Student(studenId, name, age, address));
                studenId++;

            } else if (check == 2) {
                try {
                    writeObjectToFile(dbStudent,students);
                    ArrayList<Student> listStudent = readObjectFromFile(dbStudent);
                    System.out.println("\nDanh Sach Sinh Vien:");
                    for (int i = 0;i<students.size();i++){
                        System.out.println("Sinh vien "+(i+1));
                        System.out.println("name: "+listStudent.get(i).getName());
                        System.out.println("age: "+listStudent.get(i).getAge());
                        System.out.println("address: "+listStudent.get(i).getAddress()+"\n");

                    }

                } catch (Exception e) {
                    e.printStackTrace();

                }

            } else if (check == 3) {
                System.out.print("Nhap ten Mon Hoc: ");
                String nameSubject = s.next();

                subjects.add(new Subject(markId, nameSubject));
                markId++;

            } else if (check == 4) {
                try {
                    writeObjectToFile(dbSubject,subjects);
                    ArrayList<Subject> listSubject = readObjectFromFile(dbSubject);
                    System.out.println("\nDanh sach Mon Hoc: ");
                    for (int i = 0;i<subjects.size();i++){
                        System.out.println("Mon Hoc thu: "+i+1);
                        System.out.println("name: "+listSubject.get(i).getName());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (check == 5) {
                System.out.print("Moi chon id sinh vien: ");
                int id_student = s.nextInt();
                System.out.print("Moi chon Id Mon Hoc: ");
                int id_subject = s.nextInt();
                System.out.print("Nhap diem : ");
                int mark = s.nextInt();

                marks.add(new Mark(markId,id_student,id_subject,mark));
                markId++;

            } else if (check == 6) {


                try{
                    writeObjectToFile(dbStudent,students);
                    ArrayList<Student> listStudent = readObjectFromFile(dbStudent);

                    writeObjectToFile(dbSubject,subjects);
                    ArrayList<Subject> listSubject = readObjectFromFile(dbSubject);

                    writeObjectToFile(dbMark,marks);
                    ArrayList<Mark> listMark =  readObjectFromFile(dbMark);

                    System.out.println("\nDanh Sach Sinh Vien:");
                    for(int i=0;i<marks.size();i++){
                        System.out.println("Sinh Vien: "+ listStudent.get(listMark.get(i).getStudent_id()-1).getName());
                        System.out.println("Mon Hoc: "+listSubject.get(listMark.get(i).getSubject_id()-1).getName());
                        System.out.println("Diem: "+ listMark.get(i).getMark());
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        }while (check != 7);
    }
}