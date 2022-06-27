package Task1;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone(1, "Sony", 100);
        Phone p2 = new Phone(2, "Lg", 100);
        Phone p3 = new Phone(3, "Motorolla", 100);
        Phone p4 = new Phone(4, "Siemens");
        p1.sout();
        p2.sout();
        p3.sout();
        p4.sout();

        String Vasia = "Vasia ";
        int number = 765432;
        p1.receiveCall(Vasia, number);
        p1.sendMessage(1, 3, 4, 5, 6);
    }

}
