package Object130922;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person ("1","Vasia",  new Car("Tesla"));
        Person p2 = new Person ("2","Tania",  new Car("BMV"));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));

        System.out.println("Input 1 if lite clone, or 2 Hard");
        Scanner input = new Scanner(System.in);
        byte a = input.nextByte();
        System.out.println("Input ID");
        String idUser = input.nextLine();

        if (a == 1) {
            Person cloneLite = (Person) p1.clone(); //поверхностное клонирование
            cloneLite.getCar().setModel("OKA");
            System.out.println(cloneLite.toString());
            System.out.println(p1.toString());
        }
        if (a == 2) {
            Person hardClone = new Person(p2); //глубокое клонирование
            hardClone.setName("XXX");
            hardClone.getCar().setModel("VAZ");

            System.out.println(p2.toString());
            System.out.println(hardClone.toString());
        };



    }
}
