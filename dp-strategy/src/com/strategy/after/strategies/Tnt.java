package com.strategy.after.strategies;

import com.strategy.after.Freight;

public class Tnt implements Freight {

  @Override
  public double calculate(String zipCode, double weight) {
    System.out.println("Calculate Freight TNT, ZipCode: " + zipCode + " Weight: " + weight);
    return 6.89;
  }
}
