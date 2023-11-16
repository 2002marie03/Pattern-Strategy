package org.example;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
       Context context=new Context();
        Scanner scanner=new Scanner(System.in);
        Map<String,Strategy> strategyMap=new HashMap<>();
       Strategy strategy;
       while (true){
           System.out.println("Stategy name ");
           String strategyName = scanner.nextLine();
           strategy=strategyMap.get(strategyName);
           if (strategy == null) {
               strategy = (Strategy) Class.forName("org.example.StrategyImpl" + strategyName).getConstructor(Strategy.class).newInstance();
               strategyMap.put(strategyName,strategy);

           }
           context.setStrategy(strategy);
           context.effectuerOparation();

       }
    }
}