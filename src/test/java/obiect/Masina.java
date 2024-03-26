package obiect;

public class Masina {

    //constructor = are ca rol sa initializeze variabilele unei clase
    //putem sa recunoastem un constructor dupa numele clasei
    //de cele mai multe ori constructorul este public
    //exista 2 tipuri de constructori: cu parametrii sau fara parametrii
    //intr-o clasa java exista un constructor default fara parametrii
    //obiect = instanta unei clase
    //dintr-o clasa putem instantia n obiecte
    //obiectele se diferentiaza prin numele lor sau prin numarul de parametrii pe care il primesc
    //in momentul cand un obiect primeste valori(se initializeaza), se apeleaza constructorul din clasa

    private String marca;
    private String model;
    private String culoare;
    private String carburant;
    private int anFabricatie;
    private int capacitateCilindrica;
    private int pret;

    //exista 4 concepte OOP - mostenire, incapsulare, abstractizare, polimorfism
    //mostenira = conceptul prin care o clasa este mostenita(extinsa) de o alta clasa
    //cand o clasa mostenteste o alta clasa, se formeaza o relatie de parinte - copil
    //in java o clasa poate mostenii doar o singura clasa
    //cand se aplica mostenirea, copilul poate accesa toate variabilele/metodele din parinte daca
    // sunt public/protected
    //in momentul cand copilul mosteneste parintele, copilul trebuie sa apeleze constructorul din parinte
    // cu super

    //incapsularea = conceptul prin care excludem posibilitatea ca unele informatii sa fie modificate
    //  din exteriorul clasei
    //access control in java: public, private, protected, default
    //public = ofera vizibilitate in toate pachetele din proiect
    //private = restrange vizibilitatea doar in clasa unde este definit
    //ca sa oferim vizibilitate proprietatilor in alte clase, apelam la conceptul de getter/setter

    //Polimorfismul - conceptul prin care o metoda poate avea implementari diferite
    //polimorfismul este de 2 feluri - dinamic(override) si static (overload)
    //polimorfismul dinamic - intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea
    // implementari diferite
    //polimorfismul dinamic se regaseste tot timpul in procesul de mostenire
    // -se regaseste tot timpul in procesul de mostenire.


    public Masina(String marca, String model, String culoare, String carburant, int anFabricatie
                  ,int capacitateCilindrica){
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.anFabricatie = anFabricatie;
        this.capacitateCilindrica = capacitateCilindrica;
    }

    public Masina(String marca, String model, String culoare, String carburant, int anFabricatie, int capacitateCilindrica, int pret) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.carburant = carburant;
        this.anFabricatie = anFabricatie;
        this.capacitateCilindrica = capacitateCilindrica;
        this.pret = pret;
    }

    //definim prima implementare pentru o metoda pe care o vom suprascrie
    public void pornesteMasina(){
        System.out.println("Masina porneste de la cheie");
    }

    public void prezentareMasina(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Anul fabricatiei este " + anFabricatie);
        System.out.println("Carburantul este " + carburant);
        System.out.println("Capacitatea cilindrica este " + capacitateCilindrica);
        if (pret != 0) {
            System.out.println("Pretul initial al masinii este " + pret);
        }
        else{
            System.out.println("Pretul masinii este 0");
        }
    }

    //daca >= 2023 => 5 lei
    //daca 2020 -> 2023 => 10 lei
    //daca < 2020 => 20 lei
    public void definireImpozit(){
        if (anFabricatie >= 2023){
            System.out.println("Impozitul este 5 lei");
        }
        else if(anFabricatie > 2020 && anFabricatie < 2023){
            System.out.println("Impozitul este 10 lei");
        }
        else{
            System.out.println("Impozitul este 20 de lei");
        }
    }

    //facem getter/setter

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getCarburant() {
        return carburant;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public int getCapacitateCilindrica() {
        return capacitateCilindrica;
    }

    public int getPret() {
        return pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
}
