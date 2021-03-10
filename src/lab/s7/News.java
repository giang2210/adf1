package lab.s7;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    int ID;
    String Title;
    String Publish;
    String Author;
    String Content;
    float AverageRate;
    int[] RateList = new int[3];

    //ArrayList<Integer> rateList;


    public News (){

    }
    public  News(int ID, String title,String publish,String author,String content,float averageRate,int[] RateList){
        this.ID = ID;
        this.Publish = publish;
        this. Title = title;
        this.Author = author;
        this.Content =content;
        this.AverageRate = averageRate;
        RateList = RateList;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublish() {
        return Publish;
    }

    public void setPublish(String publish) {
        Publish = publish;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    //


    @Override
    public void Display() {
        System.out.println("Id: "+ getID());
        System.out.println("Title: "+getTitle());
        System.out.println("publishDate: "+getPublish());
        System.out.println("Author: "+getAuthor());
        System.out.println("Content: "+getContent());
        System.out.println("AverageRate: "+getAverageRate());
    }

   public void calculate() {
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap 3 so: ");
       for (int i = 0; i < RateList.length; i++) {
           RateList[i] = sc.nextInt();
       }
       for (int i = 0; i < RateList.length; i++) {
           this.AverageRate += RateList[i];
       }
       this.AverageRate = AverageRate/3;

    }

}
