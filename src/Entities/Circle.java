package Entities;

// Classe Circle implementa a interface Shape e define o cálculo da área para um círculo.
public class Circle implements Shape {

	private double radius; // Raio do círculo.

	// Construtor para inicializar o raio do círculo.
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// Método para obter o raio do círculo.
	public double getRadius() {
		return radius;
	}

	// Método para definir um novo valor para o raio do círculo.
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Implementação do método area da interface Shape para calcular a área do círculo.
	@Override
	public double area() {
		return Math.PI * radius * radius; // Fórmula da área do círculo: π * raio².
	}
}