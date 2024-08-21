package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintServices<T> {

    private List<T> list = new ArrayList<>(); // Cria uma lista para armazenar valores genéricos.

    // Adiciona um valor à lista.
    public void addValue(T value) {
        list.add(value);
    }

    // Retorna o primeiro valor da lista. Lança uma exceção se a lista estiver vazia.
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    // Imprime todos os valores da lista no formato [value1, value2, ...].
    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0)); // Imprime o primeiro valor.
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i)); // Imprime valores subsequentes com uma vírgula.
        }
        System.out.println("]");
    }
}