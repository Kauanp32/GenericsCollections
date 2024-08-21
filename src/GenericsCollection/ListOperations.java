package GenericsCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Cria listas de inteiros e doubles.
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);

        // Cria uma lista vazia de objetos.
        List<Object> myObjs = new ArrayList<Object>();

        // Copia elementos da lista de inteiros para a lista de objetos.
        copy(myInts, myObjs);
        printList(myObjs); // Imprime a lista de objetos.

        // Copia elementos da lista de doubles para a lista de objetos.
        copy(myDoubles, myObjs);
        printList(myObjs); // Imprime a lista de objetos.
    }

    // Método genérico para copiar elementos de uma lista fonte para uma lista destino.
    // A lista fonte deve ser de tipo que estende Number, e a lista destino deve ser de tipo que é super Number.
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number); // Adiciona cada número da fonte para a lista destino.
        }
    }

    // Método genérico para imprimir elementos de uma lista.
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " "); // Imprime cada elemento da lista.
        }
        System.out.println(); // Adiciona uma nova linha após a impressão da lista.
    }
}