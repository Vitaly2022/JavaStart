package Task1;

public class Tiangle implements Figures {
    double a;
    double b;
    double c;

    public Tiangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double long1(double a, double b, double c) {
        return a + b + c;
    }

    double square(double a, double b, double c) {
        double p = long1(a, b, c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double outputlong() {
        return long1(a, b, c);
    }

    @Override
    public double outputquare() {
        return 0;
    }
}
