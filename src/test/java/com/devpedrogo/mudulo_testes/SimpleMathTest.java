package com.devpedrogo.mudulo_testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
  @Test
  void test(){
    SimpleMath math = new SimpleMath();
    Double result = math.adicao(6.2D, 2D);
    Assertions.assertEquals(8.2D, result);
  }
}
