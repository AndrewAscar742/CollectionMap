package dio.andrew.projeto;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Deve-se imprimir apenas o nome do autor e o livro

        System.out.println("// -- Ordem Aleatória -- //");
        Map<String, Livro> livroMap = new HashMap<>(){{
            put("Corey Taylor", new Livro("Eu te odeio!", 224));
            put("Sun Tzu", new Livro("A arte da Guerra", 160));
            put("Shirley Harrison", new Livro("O diário de Jack, o estripador", 496));
        }};

        for (Map.Entry<String, Livro> livroEntry : livroMap.entrySet()) {
            System.out.println("Autor: " + livroEntry.getKey() + " - Nome do livro: " + livroEntry.getValue().getNome());
        }

        System.out.println("// -- Ordem de inserção -- //");
        Map<String, Livro> livroMap1 = new LinkedHashMap<>(){{
            put("Corey Taylor", new Livro("Eu te odeio!", 224));
            put("Sun Tzu", new Livro("A arte da Guerra", 160));
            put("Shirley Harrison", new Livro("O diário de Jack, o estripador", 496));
        }};

        for (Map.Entry<String, Livro> livroEntry : livroMap1.entrySet()) {
            System.out.println("Autor: " + livroEntry.getKey() + " - Nome do livro: " + livroEntry.getValue().getNome());
        }

        System.out.println("// -- Ordem alfabética dos autores -- //");
        Map<String, Livro> livroMap2 = new TreeMap<>(livroMap1);

        for (Map.Entry<String, Livro> livroEntry : livroMap2.entrySet()) {
            System.out.println("Autor: " + livroEntry.getKey() + " - Nome do livro: " + livroEntry.getValue().getNome());
        }

        System.out.println("// -- Ordem alfabética nome dos livros");
        Set<Map.Entry<String, Livro>> livroMap3 = new TreeSet<>(new ComparatorNomeLivro());
        livroMap3.addAll(livroMap2.entrySet());

        for (Map.Entry<String, Livro> livroEntry : livroMap3) {
            System.out.println("Autor: " + livroEntry.getKey() + " - Nome do livro: " + livroEntry.getValue().getNome());
        }

    }
}
