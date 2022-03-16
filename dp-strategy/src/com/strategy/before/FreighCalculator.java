package com.strategy.before;

public class FreighCalculator {

  public static void main(String[] args) {
    System.out.println(calculate("mercadoenvios", "06440-260", 10));
  }

  public static double calculate(String shippingCompany, String zipCode, double weight) {
    switch (shippingCompany) {
      case "dhl":
        System.out.println("calculate Dhl, ZipCode: " + zipCode + " Weight: " + weight);
        return 10.99;
      case "correios":
        System.out.println("calculate Correios, ZipCode: " + zipCode + " Weight: " + weight);
        return 9.67;
      case "fedex":
        System.out.println("calculate Fedex, ZipCode: " + zipCode + " Weight: " + weight);
        return 7.23;
      case "jadlog":
        System.out.println("calculate Jadlog, ZipCode: " + zipCode + " Weight: " + weight);
        return 8.56;
      case "mercadoenvios":
        System.out.println("calculate Mercado Envios, ZipCode: " + zipCode + " Weight: " + weight);
        return 4.99;
      case "tnt":
        System.out.println("calculate TNT, ZipCode: " + zipCode + " Weight: " + weight);;
        return 6.89;
      default:
        return 0;
    }
  }
}
