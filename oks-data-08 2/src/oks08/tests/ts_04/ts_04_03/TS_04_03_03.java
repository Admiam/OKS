package oks08.tests.ts_04.ts_04_03;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import oks08.support.*;
import oks08.support.Tagy;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)

@ExtendWith(TestBase.class)
public class TS_04_03_03 {

  @BeforeAll
  public static void setUpBeforeAll() {
  }

  @BeforeEach
  public void setUp() {
    throw new UnsupportedOperationException("neimplementovano");
  }

  @AfterEach
  public void tearDown() {
    Utils.generujCislo();
    assertAll("Chyba neni spravne zobrazena",
            () -> assertTrue(Utils.isZobrazenaChyba(Id.GEN_CHYBA_PORADI), "Chyba poradi"),
            () -> assertTrue(Utils.isZobrazenaChyba(Id.GEN_CHYBA_CELKOVA), "Chyba celkova"),
            () -> assertFalse(Utils.isVysledekZobrazen(), "Vysledek")
    );
  }

  @Test
  @DisplayName("TC.04.03.03.03: Poradove cislo 0")
  @Tag(Tagy.AKTIVNI)
  void tc_04_03_03_03() {
    throw new UnsupportedOperationException("neimplementovano");
  }

  @Test
  @DisplayName("TC.04.03.03.04: Poradove cislo 00")
  @Tag(Tagy.AKTIVNI)
  void tc_04_03_03_04() {
    throw new UnsupportedOperationException("neimplementovano");
  }

  @Test
  @DisplayName("TC.04.03.03.05: Poradove cislo 000")
  @Tag(Tagy.AKTIVNI)
  void tc_04_03_03_05() {
    throw new UnsupportedOperationException("neimplementovano");
  }

  @Test
  @DisplayName("TC.04.03.03.06: Poradove cislo 0000")
  @Tag(Tagy.AKTIVNI)
  void tc_04_03_03_06() {
    throw new UnsupportedOperationException("neimplementovano");
  }
}
