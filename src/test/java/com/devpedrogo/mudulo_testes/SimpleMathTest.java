package com.devpedrogo.mudulo_testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
  @Test
  void testSum(){
    SimpleMath math = new SimpleMath();
    Double actual = math.adicao(6.2D, 2D);
    Double expected = 8.2D;

    assertEquals(expected, actual, "6.2 + 2 should equal 8.2");
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }
}
