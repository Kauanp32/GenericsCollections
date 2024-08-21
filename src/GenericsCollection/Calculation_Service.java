package GenericsCollection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Entities.Product;
import Services.CalculationService;

public class Calculation_Service {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o local padrão para formato numérico dos EUA.

        List<Product> list = new ArrayList<>(); // Cria uma lista para armazenar produtos.

        String path = "C:\\temp\\product.txt"; // Caminho para o arquivo de entrada.

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // Lê a primeira linha do arquivo.
            while (line != null) {
                String[] fields = line.split(","); // Divide a linha em campos.

                if (fields.length == 2) {
                    try {
                        // Cria um novo produto com o nome e preço extraídos da linha e adiciona à lista.
                        String name = fields[0].trim();
                        double price = Double.parseDouble(fields[1].trim());
                        list.add(new Product(name, price));
                    } catch (NumberFormatException e) {
                        // Ignora linhas com preço inválido
                        System.out.println("Invalid price format in line: " + line);
                    }
                }

                line = br.readLine(); // Lê a próxima linha do arquivo.
            }

            if (list.isEmpty()) {
                System.out.println("No products found.");
            } else {
                // Encontra e imprime o produto mais caro da lista usando o método max do CalculationService.
                Product x = CalculationService.max(list);
                System.out.println("Most expensive:");
                System.out.printf("%s, %.2f%n", x.getName(), x.getPrice());
            }

        } catch (IOException e) {
            // Trata exceções de leitura de arquivo e imprime a mensagem de erro.
            System.out.println("Error: " + e.getMessage());
        }
    }
}