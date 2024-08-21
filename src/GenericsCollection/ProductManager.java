package GenericsCollection;

import java.util.HashSet;
import java.util.Set;
import Entities.Product;

public class ProductManager {

    public static void main(String[] args) {

        // Cria um conjunto de produtos usando HashSet.
        Set<Product> set = new HashSet<>();

        // Adiciona alguns produtos ao conjunto.
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        // Cria um produto para verificar se já existe no conjunto.
        Product prod = new Product("Notebook", 1200.0);

        // Verifica se o conjunto contém o produto especificado e imprime o resultado.
        System.out.println(set.contains(prod));
    }
}