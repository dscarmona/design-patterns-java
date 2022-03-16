package com.strategy.after.strategies;

import com.strategy.after.Freight;

public class Correios implements Freight {

  @Override
  public double calculate(String zipCode, double weight) {
    System.out.println("Calculate Freight Correios, ZipCode: " + zipCode + " Weight: " + weight);
    return 9.67;
  }
}
