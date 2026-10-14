package com.devpedrogo.mudulo_testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
public class SimpleMathTest {

  SimpleMath math;

  @BeforeAll
  static void setup(){
    System.out.println("Running @BeforeAll method!");
  }

  @AfterAll
  static void cleanup(){
    System.out.println("Running @AfterAll method!");
  }

  @BeforeEach
  void beforeEachMethod(){

    math = new SimpleMath();
    System.out.println("Running @BeforeEach method!");
  }

  @AfterEach
  void afterEachMethod(){

    System.out.println("Running @AfterEach method!");
  }

  @Test
  @DisplayName("Test 6.2 + 2 = 8.2")
  void testSum(){

    // AAA (Triple A) Arrange, Act e Assert
    //Given / Arrange

    Double n1 = 6.2D;
    Double n2 = 2D;
    Double expected = 8.2D;

    //When / Act
    Double actual = math.adicao(n1, n2);

    //Then / Assert
    assertEquals(expected, actual, 
      () -> n1 + " + " + n2 + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }

  @Test
  @DisplayName("Test 6.2 - 2 = 4.2")
  void testSubtraction(){

    // AAA (Triple A) Arrange, Act e Assert
    //Given / Arrange

    Double n1 = 6.2D;
    Double n2 = 2D;

    //When / Act
    Double actual = math.subtracao(n1, n2);
    Double expected = 4.2D;

    //Then / Assert

    assertEquals(expected, actual, 
      () -> n1 + " - " + n2 + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }

  @Test
  @DisplayName("Test 6.2 * 2 = 12.4")
  void testMultiplication(){

    Double n1 = 6.2D;
    Double n2 = 2D;
    Double actual = math.multiplicacao(n1, n2);
    Double expected = 12.4D;

    assertEquals(expected, actual, 
      () -> n1 + " * " + n2 + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }

  @Test
  @DisplayName("Test 6.2 / 2 = 3.1")
  void testDivision(){

    Double n1 = 6.2D;
    Double n2 = 2D;
    Double actual = math.divisao(n1, n2);
    Double expected = 3.1D;

    assertEquals(expected, actual, 
      () -> n1 + " / " + n2 + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }

  @Test
  @DisplayName("Test Division By Zero returns Infinity")
  void testDivisionByZero() {

      Double actual = math.divisao(7.2, 0.0);
      
      assertEquals(Double.POSITIVE_INFINITY, actual);
  }

  @Test
  @DisplayName("Test (6.2 + 2) / 2 = 4.1")
  void testAverage(){

    Double n1 = 6.2D;
    Double n2 = 2D;
    Double actual = math.media(n1, n2);
    Double expected = 4.1D;

    assertEquals(expected, actual, 
      () -> "Average of " + n1 + " and " + n2 + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }

  @Test
  @DisplayName("Test Square Root of 9 = 3")
  void testSquareRoot(){

    Double number = 9D;
    Double actual = math.raizQuadrada(number);
    Double expected = 3D;

    assertEquals(expected, actual, 
      () -> "Square root of " + number + " should be " + expected);
    assertNotEquals(8.9D, actual);
    assertNotNull(actual);
  }
}
