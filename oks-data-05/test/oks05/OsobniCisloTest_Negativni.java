package oks05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OsobniCisloTest_Negativni {

//    private OsobniCislo oc;
//
//    @BeforeEach
//    void setUp() {
//        oc = new OsobniCislo("Novák, Josef, fav, 2014, b, p");
//
//    }

    @Test
    void isPlatneOsobniCislo_3() {
        OsobniCislo oc2 = new OsobniCislo("baf");
        boolean vysledek = oc2.isPlatneOsobniCislo();
        assertEquals(false, vysledek, "Chyba - osobni cislo neni platne");
    }

    @Test
    void testToString_2() {
        OsobniCislo oc2 = new OsobniCislo("");
        String vysledek = oc2.toString();
        assertEquals("???xxxx? <= ? ? (chybně zadáno)", vysledek, "Chyba - hodnoty si nejsou rovny");
    }


    @Test
    void zpracujPrijmeni() {
    }

    @Test
    void zpracujJmeno() {
    }


    @Test
    void zpracujFakulta() {
    }

    @Test
    void zpracujTypStudia() {
    }

    @Test
    void zpracujFormaStudia() {
    }

}
