package Entities;

// Classe Product implementa a interface Comparable para permitir comparação entre produtos.
public class Product implements Comparable<Product> {
	private String name;  // Nome do produto.
	private Double price; // Preço do produto.

	// Construtor para inicializar o nome e o preço do produto.
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Método para obter o nome do produto.
	public String getName() {
		return name;
	}

	// Método para definir o nome do produto.
	public void setName(String name) {
		this.name = name;
	}

	// Método para obter o preço do produto.
	public Double getPrice() {
		return price;
	}

	// Método para definir o preço do produto.
	public void setPrice(Double price) {
		this.price = price;
	}

	// Retorna uma representação em string do produto.
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	// Compara o nome deste produto com o nome de outro produto (ignora maiúsculas/minúsculas).
	@Override
	public int compareTo(Product other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}