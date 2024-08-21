package Entities;

// A classe Rectangle implementa a interface Shape, o que exige a implementação do método area().
public class Rectangle implements Shape {

    // Declara duas variáveis privadas para armazenar a largura e a altura do retângulo.
    private double width;
    private double height;
    
    // Construtor da classe Rectangle que inicializa a largura e a altura com os valores fornecidos.
    public Rectangle(double width, double height) {
        this.width = width;  // Atribui o valor do parâmetro width à variável de instância width.
        this.height = height; // Atribui o valor do parâmetro height à variável de instância height.
    }

    // Método para obter o valor da largura do retângulo.
    public double getWidth() {
        return width; // Retorna o valor atual da largura.
    }

    // Método para definir um novo valor para a largura do retângulo.
    public void setWidth(double width) {
        this.width = width; // Atualiza a variável de instância width com o novo valor fornecido.
    }

    // Método para obter o valor da altura do retângulo.
    public double getHeight() {
        return height; // Retorna o valor atual da altura.
    }

    // Método para definir um novo valor para a altura do retângulo.
    public void setHeight(double height) {
        this.height = height; // Atualiza a variável de instância height com o novo valor fornecido.
    }

    // Implementa o método area() da interface Shape. Calcula e retorna a área do retângulo.
    @Override
    public double area() {
        return width * height; // Calcula a área multiplicando a largura pela altura e retorna o resultado.
    }
}