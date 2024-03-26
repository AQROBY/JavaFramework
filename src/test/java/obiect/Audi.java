package obiect;

import java.util.List;

public class Audi extends Masina{
    private List<String> dotariExterioare;
    private int pretFinal;

    public Audi(String marca, String model, String culoare, String carburant, int anFabricatie,
                int capacitateCilindrica, int pret, List<String> dotariExterioare) {
        super(marca, model, culoare, carburant, anFabricatie, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareAudi(){
        prezentareMasina();
        calculDotari();
        System.out.println("Pretul final cu tot cu dotari al masinii este: " + pretFinal);
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
    }

    public void calculDotari(){
        pretFinal = getPret();
        for (int i = 0; i < dotariExterioare.size(); i++){
            switch (dotariExterioare.get(i)){
                case "faruri led":
                    pretFinal += 200;
                    break;
                case "oglinzi electrice":
                    pretFinal += 300;
                    break;
                case "camera video":
                    pretFinal += 100;
                    break;
            }
        }
    }

    public void pornesteMasina(){
        System.out.println("Masina Audi se porneste de la buton");
    }
}
