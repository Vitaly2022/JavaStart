package Task2;

public class Works implements JobTitle {
    String name = "Works";

    @Override
    public void printOfJob() {
        System.out.println(name);
    }
}
