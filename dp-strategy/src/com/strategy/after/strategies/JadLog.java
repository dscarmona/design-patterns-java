package com.strategy.after.strategies;

import com.strategy.after.Freight;

public class JadLog implements Freight {

  @Override
  public double calculate(String zipCode, double weight) {
    System.out.println("Calculate Freight JadLog, ZipCode: " + zipCode + " Weight: " + weight);
    return 8.56;
  }
}
