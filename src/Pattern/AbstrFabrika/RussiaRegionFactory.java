package Pattern.AbstrFabrika;

public class RussiaRegionFactory implements BuildGameFactory{
    @Override
    public Shooter createShooter() {
        return new RussiaShooter();
    }

    @Override
    public Strategy createStrategy() {
        return new RussiaStrategy();
    }
}
