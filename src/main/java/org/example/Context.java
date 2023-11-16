package org.example;

public class Context {

    private Strategy strategy;

    public  void effectuerOparation(){
        System.out.println("*************************");
         strategy.operationStrategy();
        System.out.println("**************************");
    }
    public void setStrategy(Strategy strategy) {
          this.strategy=strategy;
}
}
