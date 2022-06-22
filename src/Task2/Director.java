package Task2;

public class Director implements JobTitle{

    String name = "Director2";

    @Override
    public void printOfJob() {
        System.out.println(name);
    }
}
