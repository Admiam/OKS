package oks05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OsobniCisloTest_PozitivniPolotovar {

private OsobniCislo oc;

    @BeforeEach
    void setUp() {
        oc = new OsobniCislo("Novák, Josef, fav, 2014, b, p");

    }

    @Test
    void compareTo_1() {
        int vysledek = oc.compareTo(oc);
        assertEquals(0, vysledek, "Chyba - hodnoty si nejsou rovny");
    }

    @Test
    void compareTo_2() {
        OsobniCislo oc2 = new OsobniCislo("");
        int vysledek = oc.compareTo(oc2);
        assertEquals(1, vysledek, "Chyba - hodnoty si jsou rovny");
    }


    @Test
    void testToString_1() {
        String vysledek = oc.toString();
        assertEquals("A14BxxxxP <= NOVÁK Josef", vysledek, "Chyba - hodnoty si nejsou rovny");
    }


    @Test
    void getOsobniCislo() {
        String vysledek = oc.getOsobniCislo();
        assertEquals("A14BxxxxP", vysledek, "Chyba - hodnoty si jsou rovny");
    }

    @Test
    void isPlatneOsobniCislo_1() {
        oc.generujOsobniCislo("0123");
        boolean vysledek = oc.isPlatneOsobniCislo();
        assertEquals(true, vysledek, "Chyba - osobni cislo je platne");
    }

    @Test
    void isPlatneOsobniCislo_2() {
        boolean vysledek = oc.isPlatneOsobniCislo();
        assertEquals(false, vysledek, "Chyba - osobni cislo neni platne");
    }
    @Test
    void isPlatneOsobniCislo_3() {
        OsobniCislo oc2 = new OsobniCislo("baf");
        boolean vysledek = oc2.isPlatneOsobniCislo();
        assertEquals(false, vysledek, "Chyba - osobni cislo neni platne");
    }


    @Test
    void isPlatnyFormat() {
        boolean vysledek = oc.isPlatnyFormat();
        assertEquals(true, vysledek, "Chyba - format je platny");
    }

    @Test
    void getTypStudia() {
        TypStudia vysledek = oc.getTypStudia();
        assertEquals(TypStudia.BAKALARSKY, vysledek, "Chyba - typ studia je bakalarsky");
    }

    @Test
    void getFakulta() {
        String vysledek = oc.getFakulta();
        assertEquals("A", vysledek, "Chyba - fakulta je FAV");
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
    @Test
    void naplnAtributy_1() {
        oc.naplnAtributy("a, b, c, s, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, t, u, v, w, x, y, z, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9");
    }

    @Test
    void naplnAtributy_2() {
        oc.naplnAtributy("baf, 2014, b, p");
    }

    @Test
    void naplnAtributy_3() {
        oc.naplnAtributy(null);
    }

    @Test
    void zpracujRokNastupu_1() {
        String rok = "201";
        oc.zpracujRokNastupu(rok);
    }

    @Test
    void zpracujRokNastupu_2() {
        String rok = "201a";
        oc.zpracujRokNastupu(rok);
    }

    @Test
    void zpracujNepovinne() {
        oc.zpracujNepovinne("0123");
    }


    @Test
    void testToString_2() {
        OsobniCislo oc2 = new OsobniCislo("");
        String vysledek = oc2.toString();
        assertEquals("???xxxx? <= ? ? (chybně zadáno)", vysledek, "Chyba - hodnoty si nejsou rovny");
    }
}