package GenericsCollection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Entities.LogEntry;

public class LogAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um Scanner para ler a entrada do usuário.

        System.out.print("Enter file full path: ");
        String path = sc.nextLine(); // Lê o caminho do arquivo fornecido pelo usuário.

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Cria um conjunto para armazenar as entradas de log.
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine(); // Lê a primeira linha do arquivo.
            while (line != null) {

                String[] fields = line.split(" "); // Divide a linha em campos.
                String username = fields[0]; // Obtém o nome de usuário.
                Date moment = Date.from(Instant.parse(fields[1])); // Converte a string de data/hora para Date.

                set.add(new LogEntry(username, moment)); // Adiciona a entrada de log ao conjunto.

                line = br.readLine(); // Lê a próxima linha do arquivo.
            }    
            // Imprime o total de entradas de log (usuários únicos).
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); // Trata exceções de entrada/saída.
        }
        sc.close(); // Fecha o Scanner.
    }
}