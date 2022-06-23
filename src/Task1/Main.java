package Task1;

public class Main {
    public static void main(String[] args) {

        Figures t1 = new Tiangle(1, 2, 3);
        Rectangle r1 = new Rectangle(4, 5);
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(5);

        Figures[] fig5 = {c1, c2, c3, r1, t1};

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(i + "=" + fig5[i].outputlong());
            sum += fig5[i].outputlong();
        }
        System.out.println("Sum=" + sum);

    }
}
