package Task1;

public class Rectangle implements Figures {    //прямоугольник

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double long1(double a, double b) {
        return a * 2 + b * 2;
    }

    double square(double a, double b) {
        return a * 2;
    }

    @Override
    public double outputlong() {
        return long1(a, b);
    }

    @Override
    public double outputquare() {
        return 0;
    }
}

