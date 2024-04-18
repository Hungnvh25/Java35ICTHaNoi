package BaiTap.BaiTap8;

public class ATM extends user {

    public ATM(int id, String name, String pass, float money) {
        super(id, name, pass, money);
    }
    public  boolean logIn(int id , String pass){
        if(id == this.getId() && pass.equals(this.getPass()) ){
            return true;
        }

        return false;
    }

    public boolean checkMoney(float money){
        if(money <= this.getMoney()){
            return true;
        }
        return false;

    }
}
