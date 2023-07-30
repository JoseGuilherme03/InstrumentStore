import java.util.ArrayList;

public class Inventory {

    ArrayList<Instrument> inventory = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = null;
        if(spec instanceof GuitarSpec){
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        }
        else if (spec instanceof MandalinSpec){
            instrument = new Mandalin(serialNumber, price, (MandalinSpec)spec);
        }
        inventory.add(instrument);

    }

    public Instrument get(String serialNumber){
        for(Instrument instrument: this.inventory){
            if(instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
        return null;
    }

    public ArrayList search(GuitarSpec searchSpec) {
        ArrayList<Instrument> matchingGuitars = new ArrayList<>();
        for (Instrument guitar:this.inventory) {
            if (guitar.getSpec().matches((searchSpec))) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
    public ArrayList search(MandalinSpec searchSpec) {
        ArrayList<Instrument> matchingMandalins = new ArrayList<>();
        for (Instrument mandalin : this.inventory){
            if (mandalin.getSpec().matches((searchSpec))) {
                matchingMandalins.add(mandalin);
            }
        }
        return matchingMandalins;
    }
}