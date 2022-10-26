package Pattern.Fabrika;

public class Main {
    public static void main(String[] args) {
TelephoneFabrika fabrika = new TelephoneFabrika();

        Telephone a1 = fabrika.getTelephone(OperatorTypes.A1);
        Telephone mtc = fabrika.getTelephone(OperatorTypes.MTC);
        a1.call();
        mtc.call();
    }
}


