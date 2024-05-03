package oks03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PripravaDatovehoZdroje {

    private static List<String> nacteniSouboru(){
//        String soubor = System.getProperty("datovy.zdroj.oks03");
        String soubor = "priklady-oks-03.txt";
        List<String> radky = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(soubor))){
            String radka;
            while ((radka = reader.readLine()) != null){

                String[] casti = radka.split(",");
                if (!radka.trim().startsWith("#") && !radka.trim().isEmpty() )
                radky.add(radka);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return radky;
    }

    static List<Object[]> listDvojiceBooleanString(){
        List<String> radky = nacteniSouboru();
        List<Object[]> generovano = new ArrayList<>();
        for (String radka : radky){
            String[] casti = radka.split(";");
                generovano.add(new Object[]{casti[0], casti[1]});

        }
        return generovano;
    }

}
