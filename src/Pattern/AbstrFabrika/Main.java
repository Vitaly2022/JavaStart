package Pattern.AbstrFabrika;

public class Main {
    public static void main(String[] args) {
        BuildGameFactory factory;
        factory = new BelarusRegionFactory();
        factory.createShooter();
    }
}
