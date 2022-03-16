package com.strategy.after;

public class FreightService {

  private Freight freight;

  public FreightService(Freight freight){
    this.freight = freight;
  }

  public double calculateFreight(String zipCode, double weight){
    return freight.calculate(zipCode, weight);
  }
}