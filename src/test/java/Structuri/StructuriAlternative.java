package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {
    //Structuri alternative = if...then...else/switch...case

    @Test
    public void metodaTest(){
//        numarMaiMareCaX(11);
//        numarMaiMareCaX(10);
//        numarMaiMareCaX(9);
        numarParPozitiv(0);
        numarParPozitiv(1);
        numarParPozitiv(2);
        numarParPozitiv(-2);
        numarParPozitiv(-1);

        propozitie("Ana are mere", "mere", "Ana");
        propozitie("Ana are mere", "mere", "ana");

        System.out.println("----------");

        zileSaptamana(5);
    }

    //verificam daca un numar este mai mare decat 10
    public void numarMaiMareCaX(int input){
        if(input > 10){
            System.out.println(input + " este mai mare ca 10");
        }
        else if(input == 10){
            System.out.println(input + " este egal cu 10");
        }
        else {
            System.out.println(input + " este mai mic ca 10");
        }
    }

    //verificam daca un numar este par si pozitiv
    public void numarParPozitiv(int numar){
        if (numar % 2 == 0){
            if (numar >= 0){
                System.out.println(numar + " este par si pozitiv");
            }
            else{
                System.out.println(numar + " este par si negativ");
            }
        }
        else {
            if(numar >0){
                System.out.println(numar + " este impar si pozitiv");
            }
            else {
                System.out.println(numar + " este impar si negativ");
            }
        }
    }

    //verificam ca o propozitie contine 2 cuvinte
    //Ana are mere => caut ana si mere
    public void propozitie(String propozitie, String cuvant1, String cuvant2){
        if (propozitie.contains(cuvant1) && propozitie.contains(cuvant2)){
            System.out.println("Ana chiar are mere");
        }
        else{
            System.out.println("Ana nu are mere din pacate");
        }
    }

    //reprezentam cazurile pentru zilele saptamanii
    public void zileSaptamana(int zi){
        switch (zi){
            case 1:
                System.out.println("Azi e luni");
                break;
            case 2:
                System.out.println("Azi e marti");
                break;
            case 3:
                System.out.println("Azi e miercuri");
                break;
            default:
                System.out.println("Nu exista optiunea");
        }
    }
}
