package com.devpedrogo.mudulo_testes;

public class SimpleMath {

  public Double adicao(Double n1, Double n2){
    return n1 + n2;
  }

  public Double subtracao(Double n1, Double n2){
    return n1 - n2;
  }

  public Double multiplicacao(Double n1, Double n2){
    return n1 * n2;
  }

  public Double divisao(Double n1, Double n2){
    return n1 / n2;
  }

  public Double media(Double n1, Double n2){
    return (n1 + n2) / 2;
  }

  public Double raizQuadrada(Double number){
    return (Double) Math.sqrt(number);
  }
}
