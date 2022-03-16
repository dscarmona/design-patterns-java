package com.strategy.after;

import com.strategy.after.strategies.Dhl;
import com.strategy.after.strategies.MercadoEnvios;

public class Execute {

  public static void main(String[] args) {

    FreightService freightServiceDhl = new FreightService(new Dhl());
    System.out.println(freightServiceDhl.calculateFreight("06440-260", 10));

    FreightService freightServiceMercadoEnvios = new FreightService(new MercadoEnvios());
    System.out.println(freightServiceMercadoEnvios.calculateFreight("06440-260", 10));
  }
}
