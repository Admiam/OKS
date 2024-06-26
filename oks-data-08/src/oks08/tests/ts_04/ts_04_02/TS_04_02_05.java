package oks08.tests.ts_04.ts_04_02;

import jdk.jshell.execution.Util;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import oks08.support.*;
import oks08.support.Tagy;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)

@ExtendWith(TestBase.class)
public class TS_04_02_05 {

  @BeforeAll
  public static void setUpBeforeAll() {
    Utils.getURLAndWait(Const.URL_GENEROVANI);
    //throw new UnsupportedOperationException("neimplementovano");
  }

  @Test
  @DisplayName("TC.04.02.05.02: Kombinovana forma")
  @Tag(Tagy.AKTIVNI)
  void tc_04_02_05_02() {
    Utils.setPoradi("0101");
    Utils.setFakulta("FZS");
    Utils.setTyp(Utils.TYP_B);
    Utils.setRok("20");
    Utils.setForma(Id.GEN_RADBTN_FORM_KOMB);

    Utils.generujCislo();
    String vysledek = Utils.getVysledek();
    assertEquals("Z20B0101K", vysledek);
    //throw new UnsupportedOperationException("neimplementovano");
  }
}
