package assignment.s6;

import java.util.ArrayList;

public class LopHoc {
    public  String name;
    public ArrayList<Integer> lopHoc;

    public LopHoc(String name , Integer lopHoc){
        this.name = name;
        this.lopHoc = new ArrayList<Integer>();
        this.lopHoc.add(lopHoc);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ArrayList <Integer> getLopHoc() {
        return lopHoc;
    }

    public void addLopHoc(Integer lopHoc) {
        this.lopHoc.add(lopHoc);
    }
}
