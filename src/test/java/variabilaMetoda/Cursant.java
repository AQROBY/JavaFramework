package variabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    //acesta este un comentariu
    //clasa = sablon specific unui anumit obiect/produs
    //o clasa trebuie sa contina un nume
    //recunoastem o clasa intr-un fisier java dupa cuvantul class
    //intr-un fisier java putem avea mai multe clase(nu este un practice bun)
    //variabila = proprietatea unei clase
    //intr-o clasa putem avea mai multe variabile
    //exista 2 tipuri de variabile: global si local
    //variabila globala = vizibila peste tot in acest fisier
    //variabila locala = vizibila doar in locul unde este definita
    //pentru inceput toate variabilele globale sunt publice
    //diferenta intre global si local o face access control(public)
    //tipuri de date: String, Integer, Double (64 biti), Float (32 biti), Character, Boolean
    //nu este obligatoriu ca o variabila sa primeasca o valoare cand o definim


    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //metoda = actiunea unei clase
    //intr-o clasa putem avea mai multe metode diferentiate prin nume
    //metodele sunt de 2 feluri: void si return
    //metoda void = cea mai des folosita care are ca scop sa execute si sa afiseze informatia
    //return = are ca scop sa execute si sa returneze informatia
    //o metoda poate sau nu sa contina parametrii
    //parametrii se diferentiaza prin numar, nume sau tip

    @Test
    public void metodaCursant() {
//        nume = "Petroesc";
//        prenume = "Robert";
//        varsta = 29;
//        inaltime = 1.72;
//        greutate = 80.0f;
//        sex = 'm';
//        areRestante = true;

        prezentareCursant("Petroesc", "Robert",
                29, 1.72,80.0f, 'm', true );
        prezentareCursant("Bodestean", "Denis",
                29, 1.76,55.5f, 'm', true );
        calculMedie(10, 9, 8, 6, 1);

        System.out.println(getSalariu());
    }

    public void prezentareCursant(String nume, String prenume, Integer varsta, Double inaltime, Float greutate, Character sex, Boolean areRestante){
        System.out.println("Numele complet al cursantului este " +
                nume + " " + prenume + ". Are varsta de " + varsta
                + ". Are inaltimea de " + inaltime +
                ". Are greutatea de " + greutate +
                ". Sexul cursantului este " + sex +
                " iar legat de restante, se pare ca " + areRestante);
        nume = "Bianca";
    }

    //Calculam media cursantului din sesiune
    void calculMedie(int nota1, int nota2, int nota3, int nota4, int nota5) {
        int medie = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("Media cursantului este " + medie);
        nume = "Adi";
    }

    //exemplu metoda return
    public int getSalariu(){
        int salar = 2000;
        return salar;
    }
}
