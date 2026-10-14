package com.devpedrogo.mudulo_testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
  @Test
  void testSum(){
    SimpleMath math = new SimpleMath();

    Double n1 = 6.2D;
    Double n2 = 2D;
    Double actual = math.adicao(n1, n2);
    Double expected = 8.2D;

    assertEquals(expected, actual, 
      () -> n1 + " + " + n2 + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }
}
