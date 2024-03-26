package teme;

import org.testng.annotations.Test;

public class Tema1 {
    //clasa masina, afiseaza 4 masini/ echipa de fotbal
    private String producator;
    private String marca;
    private String tip;
    private int numarUsi;
    private int anFabricatie;
    private boolean inProductie;

    @Test
    public void metodaMasina(){
        prezentareMasina("Dacia", "Spring", "SUV", 4, 2020,
                true);
        prezentareMasina("Volvo", "V60", "berlina", 4, 2020,
                false);
    }

    public void prezentareMasina(String producator, String marca, String tip, int numarUsi,
                                 int anFabricatie, boolean inProductie){

        String inProductieString = transformBool(inProductie);

        System.out.println("Producatorul masinii este " +
                producator + " si marca este " + marca + "."  +  "\n" + "Tipul masinii este " + tip +
                " si are " + numarUsi + " usi. " +  "\n" + "Anul fabricatiei este " + anFabricatie +
                " si este inca in productie: " + inProductieString + "\n");
    }

    private String transformBool(boolean inProductie) {
        if (inProductie){
            return "da";
        }
        return "nu";
    }
}
