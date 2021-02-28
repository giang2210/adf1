package lab.s3;

public class Main {
    public static void main(String[] args){
        Room r = new Room();
        r.setName("Phong so 1");
        r.setPosition("25 tran duy hung");
        r.addUser("Hoàng Anh Tú");
        r.addUser("Trương Đăng Quang");
        r.addUser("Hoàng Văn Sơn");
        r.removeUser(2);
        r.printRoom();
    }
}
