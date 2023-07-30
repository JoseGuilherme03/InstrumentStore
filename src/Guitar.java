import java.util.Iterator;

public class Guitar extends Instrument {

    public Guitar(String serialNumber, double price, GuitarSpec spec){
        super(serialNumber, price, spec);
    }

    @Override
    public String toString() {
        return getSerialNumber() + ", " + getPrice() + ", " + getSpec();
    }
}