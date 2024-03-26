package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {

    //multimi = array, lista, map


    @Test
    public void metodaTest(){
        colegiCursArray();
        System.out.println("------");
        colegiCursList();
        System.out.println("------");
        diferiteGrupe();
        System.out.println("------");
        tariOrase();
    }

    //reprezentam multimea colegilor de la curs
    public void colegiCursArray(){
        String[] colegi = new String[4];
        colegi[0] = "Daniel";
        colegi[1] = "Robert";
        colegi[2] = "Alex";
        colegi[3] = "Ion";
        for(int i = 0; i < colegi.length; i++){
            System.out.println(colegi[i]);
        }
    }

    //exemplul de mai sus cu liste
    public void colegiCursList(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Daniel");
        colegi.add("Robert");
        colegi.add("Alex");
        colegi.add("Ion");

        for (int i = 0; i < colegi.size(); i++){
            System.out.println(colegi.get(i));
        }
    }

    //map => key(fruct)-value(mar)
    public void diferiteGrupe(){
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("fruct", "mar");
        obiecte.put("haina", "pantalon");
        obiecte.put("legume", "varza");

        for (String key: obiecte.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + obiecte.get(key));
        }
    }

    //reprezentam niste tari cu orasele care le apartin
    public void tariOrase(){
        Map<String, List<String>> diverse = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Sevilla");

        List<String> oraseGermania = new ArrayList<>();
        oraseGermania.add("Munchen");
        oraseGermania.add("Berlin");

        diverse.put("Romania", oraseRomania);
        diverse.put("Spania", oraseSpania);
        diverse.put("Germania", oraseGermania);


        for (String key: diverse.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + diverse.get(key));
        }
        //key - e unica, valorile - pot fi duplicate
    }

    //tema : mancare cu lista de ingrediente (hashMap);
    //tema : adauga cartiere pentru orasele specificate
}
