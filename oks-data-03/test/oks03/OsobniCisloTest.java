package oks03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class OsobniCisloTest {

    @BeforeEach
    void setUp() {
    }

    @ParameterizedTest(name = "{index}: vysledek={0}; data:{1}")
    @MethodSource("oks03.PripravaDatovehoZdroje#listDvojiceBooleanString")
    void isPlatnyFormat(Boolean vysledek, String radkaDat) {
        OsobniCislo oc = new OsobniCislo(radkaDat);
        assertEquals(vysledek, oc.isPlatnyFormat());
    }
}