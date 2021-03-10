package session.s9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class DemoDate {
    public static void main(String[] args) {
        LocalDate Id = LocalDate.now();//ngay hom nay
        System.out.println("hom nay la ngay: " + Id);
        System.out.println("ngay mai: " + Id.plusDays(1));
        System.out.println("tuan sau: " + Id.plusWeeks(1));
        System.out.println("thang sau: " + Id.plusMonths(1));
        System.out.println("nam sau: " + Id.plusYears(1));
        System.out.println("thang truoc: " + Id.minusMonths(1));
        System.out.println("thang nay la thang: " + Id.getMonthValue());
        LocalDate k2x = LocalDate.parse("1990-10-25");
        System.out.println("hom do la thu: " + k2x.getDayOfWeek());
        System.out.println("trong nam la thu: " + k2x.getDayOfYear());
        System.out.println("nam: " + k2x.getYear());

        LocalDate k3 = LocalDate.of(1999, 6, 19);
        // dung local date in ra ds nam nhuan trong the ky 21
        // cach 1
        LocalDate kt = LocalDate.of(2001, 12, 31);
        while (kt.getYear() < 2101) {
            if (kt.getDayOfYear() == 366) {
                System.out.println(kt.getYear());
            }
            kt = kt.plusYears(1);
        }

        // cach 2
        LocalDate t2 = LocalDate.parse("2001-02-28");
        System.out.println("danh sach cac nam nhuan");
        while (t2.getYear() < 2101) {
            if (t2.plusDays(1).getDayOfMonth() == 29) {
                System.out.println(t2.getYear());
            }
            t2 = t2.plusYears(1);

        }
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("ngay luc nay"+dt);
        System.out.println("ti nua: "+dt.plusHours(1));
        System.out.println("ti nua: "+dt.plusMinutes(15));
        System.out.println("ti nua: "+dt.plusSeconds(15));
        System.out.println("ti nua: "+dt.plusNanos(15));
    }
}
