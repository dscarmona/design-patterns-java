package com.strategy.after.strategies;

import com.strategy.after.Freight;

public class Fedex implements Freight {

  @Override
  public double calculate(String zipCode, double weight) {
    System.out.println("Calculate Freight Fedex, ZipCode: " + zipCode + " Weight: " + weight);
    return 7.23;
  }
}
