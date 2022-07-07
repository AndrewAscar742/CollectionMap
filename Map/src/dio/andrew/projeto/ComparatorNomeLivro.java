package dio.andrew.projeto;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
