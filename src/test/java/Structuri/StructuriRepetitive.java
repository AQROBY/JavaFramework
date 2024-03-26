package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {
    //structuri repetitive = for, while, foreach

    @Test
    public void metodaTest(){
        afisamPrimeleNNumere(5);
        System.out.println("---------");
        afisamPrimeleNNumereCuWhile(15);
        System.out.println("---------");
        afisamNumerelePare(20);
    }

    //afisam primele 15 numere
    public void afisamPrimeleNNumere(int capat){
        for(int i = 0; i <= capat; i++){
            System.out.println(i);
        }
    }

    //aceeasi metoda cu while
    public void afisamPrimeleNNumereCuWhile(int capat){
        int i = 0;
        while(i <= capat){
            System.out.println(i);
            i++;
        }
    }

    //vreau sa afisez numerele pare de la 0 la 20
    public void afisamNumerelePare(int capat){
        for (int i = 0; i <= capat; i += 2){
            System.out.println(i);
        }
    }
}
