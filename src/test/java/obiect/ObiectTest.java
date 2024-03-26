package obiect;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ObiectTest {

    @Test
    public void metodaTest(){
        List<String> dotariExterioare = Arrays.asList("faruri led", "oglinzi electrice", "camera video");
        Audi audi = new Audi("Audi", "A6", "Rosu", "benzina",
                2021, 1999, 20000, dotariExterioare);
        audi.setCuloare("Albastru");
        audi.prezentareAudi();
        audi.definireImpozit();
        audi.pornesteMasina();
        System.out.println();

        List<String> dotariExterioareBmw = Arrays.asList("faruri led", "oglinzi electrice", "camera video");
        List<String> dotariInterioareBmw = Arrays.asList("incalzire scaune", "incalzire volan",
                "head-up display");
        Bmw bmw = new Bmw("BMW", "M6", "negru", "benzina",
                2024, 2000, 35000, dotariExterioareBmw, dotariInterioareBmw);
        bmw.prezentareBmw();
        bmw.definireImpozit();
        bmw.pornesteMasina();
        System.out.println();

//        Masina toyota = new Masina("Toyota", "Ranger", "negru", "motorina",
//                2000, 1200, 20000);
//        toyota.prezentareMasina();
//        toyota.definireImpozit();
    }
}
