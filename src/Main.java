import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, "StratoCastor", Type.ACOUSTIC, 6, Wood.ALDER, Wood.ALDER);

        ArrayList<Instrument> matchingGuitars = inventory.search(whatLookingFor);

        if (! matchingGuitars.isEmpty()) {
            System.out.println("We have ");
            for (Instrument instrument : matchingGuitars) {
                System.out.println(instrument);
            }
        } else {
            System.out.println("Sorry, we have nothing for you");
        }
    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addInstrument("v1",
                1000,
                new GuitarSpec(Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                6,
                Wood.ALDER,
                Wood.ALDER));

        inventory.addInstrument("v2",
                1000,
                new GuitarSpec(Builder.FENDER ,
                "Stratocastor",
                Type.ACOUSTIC,
                6,
                Wood.ALDER,
                Wood.ALDER));

    }
}