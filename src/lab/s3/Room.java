package lab.s3;

import java.util.ArrayList;
public class Room {
    String name;
    String position;
    ArrayList<String> users ;

    public Room() {
        users = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addUser(String u){
        users.add(u);
    }

    public void removeUser(int index){
        users.remove(index);
    }

    public void printRoom(){
        System.out.println("Room:"+getName());
        System.out.println("Position:"+getPosition());
        System.out.println("Users:");
        for(String i:users){
            System.out.println(i);
        }
    }
}
