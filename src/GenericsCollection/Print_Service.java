package GenericsCollection;

import java.util.Scanner;
import Services.PrintServices;

public class Print_Service {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário.

        // Cria uma instância de PrintServices para gerenciar inteiros.
        PrintServices<Integer> ps = new PrintServices<>();
        
        System.out.print("How many values? ");
        int n = sc.nextInt(); // Lê o número de valores que serão inseridos.
         
        // Lê os valores fornecidos pelo usuário e os adiciona ao PrintServices.
        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        // Imprime todos os valores armazenados no PrintServices.
        ps.print();

        // Obtém e imprime o primeiro valor armazenado.
        Integer x = ps.first();
        System.out.println("First: " + x);
        
        sc.close(); // Fecha o Scanner.
    }
}