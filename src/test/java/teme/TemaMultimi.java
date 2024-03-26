package teme;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemaMultimi {

    @Test
    public void metodaTest(){
        jucatoriFotbal();
        System.out.println("----------------");
        echipeFotbal();
    }

    public void jucatoriFotbal(){
        HashMap<String, List<String>> jucatori = new HashMap<>();
        jucatori.put("Barcelona", Arrays.asList("Yamal", "Lewandowski, Raphinha"));
        jucatori.put("Real Madrid", Arrays.asList("Militao", "Vinicius Jr", "Joselu"));
        jucatori.put("Atletico Madrid", Arrays.asList("Hermoso", "Savic", "Oblak"));

        for(String key: jucatori.keySet()){
            System.out.println("Echipa de fotbal " + key);
            System.out.println("are urmatorii jucatori: " + jucatori.get(key));
        }
    }

    public void echipeFotbal(){
        Map<String, Map<String, List<String>>> echipe = new HashMap<>();

        HashMap<String, List<String>> jucatoriBarca = new HashMap<>();
        jucatoriBarca.put("RW", Arrays.asList("Yamal, Raphinha"));
        jucatoriBarca.put("ST", Arrays.asList("Lewandowski, Roque, Guiu"));
        jucatoriBarca.put("LW", Arrays.asList("Felix, Torres"));
        echipe.put("Barcelona", jucatoriBarca);

        HashMap<String, List<String>> jucatoriReal = new HashMap<>();
        jucatoriReal.put("AM", Arrays.asList("Bellingham, Guler"));
        jucatoriReal.put("ST", Arrays.asList("Joselu"));
        jucatoriReal.put("LW", Arrays.asList("Vinicius Jr"));
        echipe.put("Real Madrid", jucatoriReal);


        for (String key: echipe.keySet()) {
                System.out.println("Echipa de fotbal " + key + " are urmatorii jucatori "
                        + echipe.get(key));
            }
    }
}
