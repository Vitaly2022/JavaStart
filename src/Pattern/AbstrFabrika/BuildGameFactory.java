package Pattern.AbstrFabrika;

public interface BuildGameFactory {
    Shooter createShooter();
    Strategy createStrategy();
}
