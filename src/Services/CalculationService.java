package Services;

import java.util.List;

public class CalculationService {

    // Método genérico para encontrar o maior elemento em uma lista.
    // O tipo T deve implementar a interface Comparable<T>.
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty"); // Lança exceção se a lista estiver vazia.
        } 
        T max = list.get(0); // Assume que o primeiro elemento é o maior inicialmente.
        for (T item : list) {
            if (item.compareTo(max) > 0) { // Compara cada item com o maior encontrado até agora.
                max = item; // Atualiza o maior item se encontrar um maior.
            }
        }
        return max; // Retorna o maior item encontrado na lista.
    }
}