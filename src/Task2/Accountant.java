package Task2;

public class Accountant implements JobTitle {

    String name = "Accountant";

    @Override
    public void printOfJob() {
        System.out.println(name);
    }
}
