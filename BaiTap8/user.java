package BaiTap.BaiTap8;

import java.util.List;

public class user {
    private int id;
    private  String name;
    private  String pass;

    private  float money;


    public user(int id, String name, String pass, float money) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

}
