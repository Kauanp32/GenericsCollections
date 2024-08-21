package GenericsCollection;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentCourseAnalyzer {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário.

        // Conjuntos para armazenar os números dos estudantes em cada curso.
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        // Lê o número de estudantes no curso A e adiciona seus números ao conjunto a.
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        // Lê o número de estudantes no curso B e adiciona seus números ao conjunto b.
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        // Lê o número de estudantes no curso C e adiciona seus números ao conjunto c.
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        // Cria um conjunto total que contém todos os estudantes dos cursos A, B e C.
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        // Exibe o total de estudantes únicos.
        System.out.println("Total students: " + total.size());

        sc.close(); // Fecha o Scanner.
    }
}