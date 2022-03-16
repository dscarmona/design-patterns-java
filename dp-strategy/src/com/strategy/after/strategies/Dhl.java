package com.strategy.after.strategies;

import com.strategy.after.Freight;

public class Dhl implements Freight {

  @Override
  public double calculate(String zipCode, double weight) {
    System.out.println("Calculate Freight DHL, ZipCode: " + zipCode + " Weight: " + weight);
    return 10.99;
  }
}
