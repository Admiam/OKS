package oks08.tests.ts_04.ts_04_04;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import oks08.support.*;
import oks08.support.Tagy;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)

@ExtendWith(TestBase.class)
public class TS_04_04_01 {

  @BeforeAll
  public static void setUpBeforeAll() {
    throw new UnsupportedOperationException("neimplementovano");
  }

  @Test
  @DisplayName("TC.04.04.01: Vymazani priznaku zahranicni student")
  @Tag(Tagy.AKTIVNI)
  void tc_04_04_01() {
    throw new UnsupportedOperationException("neimplementovano");
//    assertFalse(Utils.isZahranicni());
  }
}
