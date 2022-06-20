package CreditC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);

        CreditCard cr1 = new CreditCard(1, 1000);
        CreditCard cr2 = new CreditCard(2, 1000);
        CreditCard cr3 = new CreditCard(3, 1000);

        cr1.viewinvoice();
        cr2.viewinvoice();
        cr3.viewinvoice();

        System.out.println("Enter the replenishment amount Card1:");
        int nach = vvod.nextInt();
        System.out.println("Total sum:" + cr1.nachisl(nach));

        System.out.println("Enter the replenishment amount Card2:");
        nach = vvod.nextInt();
        System.out.println("Total sum:" + cr2.nachisl(nach));

        System.out.println("Enter the replenishment amount Card3:");
        nach = vvod.nextInt();
        System.out.println("Total sum:" + cr3.takeoff(nach));

        cr1.viewinvoice();
        cr2.viewinvoice();
        cr3.viewinvoice();

    }

}
