package Pattern.Fabrika;

public class TelephoneFabrika {
    public Telephone getTelephone(OperatorTypes type) {
        Telephone toBild = null;
        switch (type) {
            case A1:
                toBild= new A1();
                break;
            case MTC:
                toBild= new MTC();
                break;
            default:
                throw new IllegalArgumentException("Wrong operator"+type);
        }
        return toBild;
    }
}
