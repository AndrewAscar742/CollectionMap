package dio.andrew.map;

import java.util.*;

public class MainTeste {

    public static void main(String[] args) {
        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 15d);
            put("tucson", 15d);
            put("nissan", 15d);
            put("volkswagen", 15d);
        }};

        System.out.println(carros);

        System.out.println("Faça alteração nos valores dos carros e adicione dois carros com valores iguais");
        carros.put("gol", 14.4d);
        carros.put("tucson", 16.1d);
        carros.put("nissan", 15.5d);
        carros.put("volkswagen", 12.5d);
        carros.put("kwid", 15d);
        carros.put("uno", 15d);
        System.out.println(carros);

        System.out.println("Devolva todos os valores");
        System.out.println(carros.values());

        System.out.println("Devolva o maior elemento");
        double max = Collections.max(carros.values());
        System.out.println(max);

        System.out.println("Devolva o menor elemento");
        double min = Collections.min(carros.values());
        System.out.println(min);

        System.out.println("Some todos os elementos");
        Iterator<Double> iterator = carros.values().iterator();
        double soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Remova os elementos igual a 15");
        carros.values().removeIf(Double -> Double.equals(15.0));
        System.out.println(carros);

        System.out.println("Devolva as keys de seu map");
        Set<String> strings = carros.keySet();
        System.out.println(strings);

        System.out.println("Devolva a key e o valor do carro com o maior valor");
        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if (max == entry.getValue()){
                String key = entry.getKey();
                System.out.println("Modelo: " + key + " Velocidade em KM: " + entry.getValue());
            }
        }

        System.out.println("Devolva a key e o valor do carro com o menor valor");
        for (Map.Entry<String, Double> entry : carros.entrySet()){
            if (min == entry.getValue()){
                String key = entry.getKey();
                System.out.println("Modelo: " + key + " Velocidade em KM: " + entry.getValue());
            }
        }
    }
}
