package obiect;

import java.util.List;

public class Bmw extends Masina{
    private List<String> dotariExterioare;
    private List<String> dotariInterioare;
    private int pretFinal;
    public Bmw(String marca, String model, String culoare, String carburant, int anFabricatie,
               int capacitateCilindrica, int pret, List<String> dotariExterioare,
               List<String> dotariInterioare) {
        super(marca, model, culoare, carburant, anFabricatie, capacitateCilindrica, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void prezentareBmw(){
        prezentareMasina();
        calculDotari();
        System.out.println("Dotarile exterioare sunt: " + dotariExterioare);
        System.out.println("Dotarile interioare sunt: " + dotariInterioare);
        System.out.println("Pretul final al masinii este: " + pretFinal);
    }

    public void calculDotari(){
        pretFinal = getPret();
        for (int i = 0; i < dotariExterioare.size(); i++){
            switch (dotariExterioare.get(i)){
                case "faruri led":
                    pretFinal += 120;
                    break;
                case "oglinzi electrice":
                    pretFinal+= 150;
                    break;
                case "camera video":
                    pretFinal += 200;
                    break;
            }
        }

        for (int i = 0; i < dotariInterioare.size(); i++){
            switch (dotariInterioare.get(i)){
                case "incalzire scaune":
                    pretFinal += 200;
                    break;
                case "incalzire volan":
                    pretFinal+= 150;
                    break;
                case "head-up display":
                    pretFinal += 250;
                    break;
            }
        }
    }

    public void pornesteMasina(){
        System.out.println("Masina BMW porneste de la buton si cheie");
    }
}
