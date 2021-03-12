package BaiKiemTraThucHanh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Hotel> hotel = new ArrayList<Hotel>();

        hotel.add(new Hotel("hotel1", "location1", "ownername1"));
        hotel.add(new Hotel("hotel2", "location2", "ownername2"));
        hotel.add(new Hotel("hotel3", "location3", "ownername3"));
        hotel.add(new Hotel("hotel4", "location4", "ownername4"));
        hotel.add(new Hotel("hotel5", "location5", "ownername5"));
        hotel.add(new Hotel("hotel6", "location6", "ownername6"));
        hotel.add(new Hotel("hotel7", "location7", "ownername7"));
        hotel.add(new Hotel("hotel8", "location8", "ownername8"));
        hotel.add(new Hotel("hotel9", "location9", "ownername9"));
        hotel.add(new Hotel("hotel10", "location10", "ownername10"));

        Scanner scanner = new Scanner(System.in);
        String ownerName;
        System.out.println("Input the Owner’s Name:");
        ownerName = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < hotel.size(); i++) {
            if (ownerName.equals(hotel.get(i).getOwnerName())) {
                System.out.println("Hotel name: " + hotel.get(i).getName() + " Hotel location: "
                        + hotel.get(i).getLocation() + " Hotel owner name: " + hotel.get(i).getOwnerName());
            }
        }
        System.out.println("Accomplished");
    }

}
