package Pattern.AbstrFabrika;

public class BelarusRegionFactory implements BuildGameFactory{
    @Override
    public Shooter createShooter() {
        return new BelarusShoteer();
    }

    @Override
    public Strategy createStrategy() {
        return new BelarusStrategy();
    }
}
