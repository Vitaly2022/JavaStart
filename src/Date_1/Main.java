package Date_1;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input Day:");
        Scanner input = new Scanner(System.in);
        int d, m, y;
        d = input.nextInt();
        System.out.print("Input manth:");
        m = input.nextInt();
        System.out.print("Input year:");
        y  = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);
        DayOfWeek day_week = date.getDayOfWeek();
        System.out.println("Today " + day_week);

        date = date.with(TemporalAdjusters.next(day_week.TUESDAY));
        System.out.print("Next TUESDAY at " + date);
       }
}
