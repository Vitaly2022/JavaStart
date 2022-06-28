package Task2_280622;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Therapist Terap = new Therapist();
        Surgeon Surg = new Surgeon();
        Dentist Dent = new Dentist();
        Human Human = new Human();
        TreatmentPlan TrPlan = new TreatmentPlan();
        out.println("Enter name:");
        Scanner input = new Scanner(System.in);
        Human.name = input.nextLine();
        out.println("Enter treatment plan:");
        int a = input.nextInt();
        TrPlan.getPlan(a);
    }
}
