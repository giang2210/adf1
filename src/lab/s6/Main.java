package lab.s6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("nam","098765588");
        pb.insertPhone("nam12","098765588");
       // pb.insertPhone("nam","098765588");
        //pb.insertPhone("nam","098765588");
        //pb.insertPhone("nam","098765588");
        //pb.printPhoneList();
        //pb.sort();
        pb.printPhoneList();
    }
}
