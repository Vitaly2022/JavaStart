package Task1;

public class Circle implements Figures {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double long1(double radius) {
        return radius * 2 * 3.14d;
    }

    double square(double radius) {
        return 3.14d * radius * radius;
    }

    @Override
    public double outputlong() {
        return long1(radius);
    }

    @Override
    public double outputquare() {
        return 0;
    }
}
