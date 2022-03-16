package com.strategy.after.strategies;

import com.strategy.after.Freight;

public class MercadoEnvios implements Freight {

  @Override
  public double calculate(String zipCode, double weight) {
    System.out.println("Calculate Freight Mercado Envios, ZipCode: " + zipCode + " Weight: " + weight);
    return 4.99;
  }
}
