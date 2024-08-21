package GenericsCollection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
    public static void main(String[] args) {
        // Cria dois conjuntos de inteiros usando TreeSet, que mantém a ordem natural dos elementos.
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União: combina todos os elementos de a e b.
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("Union: " + c);

        // Interseção: mantém apenas os elementos comuns a ambos os conjuntos.
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Intersection: " + d);

        // Diferença: remove todos os elementos de b do conjunto a.
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Difference: " + e);
    }
}