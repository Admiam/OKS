package oks02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OsobniCisloTest {
    private OsobniCislo oc;

    @BeforeEach
    void setUp() {
        oc = new OsobniCislo("Novák, Josef, fav, 2014, b, 0123, p, i");
    }


    @Test
    void osobniCislo_1() {
        assertEquals("A14B0123P", oc.getOsobniCislo());
    }

    @Test
    void getOsobniCislo_1() {
        assertEquals("A14B0123P", oc.getOsobniCislo());
    }



    @Test
    void isPlatneOsobniCislo_1() {
        oc.platnyFormat = true;
        assertTrue(oc.isPlatneOsobniCislo());
    }

    @Test
    void isPlatneOsobniCislo_2() {
        oc.vysledek = Konstanty.PRAZDNY;
        assertFalse(oc.isPlatneOsobniCislo());
    }

    @Test
    void isPlatneOsobniCislo_3() {
        oc.platnyFormat = false;
        assertFalse(oc.isPlatneOsobniCislo());
    }

    @Test
    void isPlatnyFormat_1() {
        oc.platnyFormat = true;
        assertTrue(oc.isPlatnyFormat());
    }

    @Test
    void isPlatnyFormat_2() {
        oc.platnyFormat = false;
        assertFalse(oc.isPlatnyFormat());
    }

    @Test
    void getTypStudia_1() {
        assertEquals(TypStudia.BAKALARSKY, oc.getTypStudia());
    }

    @Test
    void getTypStudia_2() {
        oc.typStudia = TypStudia.NAVAZUJICI;
        assertEquals(TypStudia.NAVAZUJICI, oc.getTypStudia());
    }

    @Test
    void getTypStudia_3() {
        oc.typStudia = TypStudia.DOKTORSKY;
        assertEquals(TypStudia.DOKTORSKY, oc.getTypStudia());
    }

    @Test
    void getTypStudia_4() {
        oc.typStudia = TypStudia.MAGISTERSKY;
        assertEquals(TypStudia.MAGISTERSKY, oc.getTypStudia());
    }

    @Test
    void getTypStudia_5() {
        oc.typStudia = TypStudia.NEPLATNY;
        assertEquals(TypStudia.NEPLATNY, oc.getTypStudia());
    }

    @Test
    void getFakulta_1() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[0][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[0][0], oc.getFakulta());
    }

    @Test
    void getFakulta_2() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[1][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[1][0], oc.getFakulta());
    }

    @Test
    void getFakulta_3() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[2][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[2][0], oc.getFakulta());
    }

    @Test
    void getFakulta_4() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[3][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[3][0], oc.getFakulta());
    }

    @Test
    void getFakulta_5() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[4][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[4][0], oc.getFakulta());
    }

    @Test
    void getFakulta_6() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[5][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[5][0], oc.getFakulta());
    }

    @Test
    void getFakulta_7() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[6][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[6][0], oc.getFakulta());
    }

    @Test
    void getFakulta_8() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[7][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[7][0], oc.getFakulta());
    }

    @Test
    void getFakulta_9() {
        oc.fakulta = Konstanty.PLATNE_FAKULTY[8][0];
        assertEquals(Konstanty.PLATNE_FAKULTY[8][0], oc.getFakulta());
    }

    @Test
    void zpracujPrijmeni_1() {
        oc.zpracujPrijmeni("Novák");
        assertEquals("NOVÁK", oc.prijmeni);
    }

    @Test
    void zpracujPrijmeni_2() {
        oc.zpracujPrijmeni(null);
        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void zpracujPrijmeni_3() {
        oc.zpracujPrijmeni(null);
        assertEquals(Konstanty.ZNAK_CHYBY, oc.prijmeni);
    }

    @Test
    void zpracujJmeno_1() {
        oc.zpracujJmeno("Josef");
        assertEquals("Josef", oc.jmeno);
    }

    @Test
    void zpracujJmeno_2() {
        oc.zpracujJmeno(null);
        assertEquals(Konstanty.ZNAK_CHYBY, oc.jmeno);
    }

    @Test
    void zpracujJmeno_3() {
        oc.zpracujJmeno(null);
        assertEquals(false, oc.platnyFormat);
    }


    @Test
    void zpracujRokNastupu_1() {
        oc.zpracujRokNastupu("2024");
        assertEquals("24", oc.rokNastupu);
    }

    @Test
    void zpracujRokNastupu_2() {
        oc.zpracujRokNastupu(null);
        assertEquals(Konstanty.ZNAK_CHYBY, oc.rokNastupu);
    }

    @Test
    void zpracujRokNastupu_3() {
        oc.zpracujRokNastupu("23324234");
        assertEquals(Konstanty.ZNAK_CHYBY, oc.rokNastupu);
    }

    @Test
    void zpracujRokNastupu_4() {
        oc.zpracujRokNastupu("23324234");
        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void zpracujRokNastupu_5() {
        assertThrows(NumberFormatException.class, () -> oc.zpracujRokNastupu("1.221"));
        //        assertEquals(Konstanty.ZNAK_CHYBY, oc.rokNastupu);
//        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void chybnyRokNastupu() {
        oc.chybnyRokNastupu();
        assertEquals(Konstanty.ZNAK_CHYBY, oc.rokNastupu);
        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void zpracujFakulta_1() {
        oc.zpracujFakulta("FAV");
        assertEquals("A", oc.fakulta);
    }

    @Test
    void zpracujFakulta_2() {
        oc.zpracujFakulta("fav");
        assertEquals(Konstanty.ZNAK_CHYBY, oc.fakulta);
        assertEquals(false, oc.platnyFormat);

    }

    @Test
    void zpracujFakulta_3() {
        oc.zpracujFakulta("FEL");
        assertEquals("E", oc.fakulta);
        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void zpracujTypStudia_1() {
        oc.zpracujTypStudia("B");
        assertEquals(TypStudia.BAKALARSKY, oc.typStudia);
    }

    @Test
    void zpracujTypStudia_2() {
        oc.zpracujTypStudia("b");
        assertEquals(TypStudia.NEPLATNY, oc.typStudia);
        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void zpracujFormaStudia_1() {
        oc.zpracujFormaStudia("P");
        assertEquals("P", oc.formaStudia);
    }

    @Test
    void zpracujFormaStudia_2() {
        oc.zpracujFormaStudia("K");
        assertEquals("K", oc.formaStudia);
    }

    @Test
    void zpracujFormaStudia_3() {
        oc.zpracujFormaStudia("z");
        assertEquals(Konstanty.ZNAK_CHYBY, oc.formaStudia);
        assertEquals(false, oc.platnyFormat);
    }

    @Test
    void zpracujNepovinne_1() {
        oc.zpracujNepovinne("i");
        assertEquals("i", oc.nepovinne);
    }

    @Test
    void zpracujNepovinne_2() {
        oc.zpracujNepovinne(null);
        assertEquals(Konstanty.PRAZDNY, oc.nepovinne);
    }
}