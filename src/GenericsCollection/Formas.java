package GenericsCollection;

import java.util.ArrayList;
import java.util.List;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;

public class Formas {

    public static void main(String[] args) {

        // Cria uma lista de formas (Shape) e adiciona instâncias de Rectangle e Circle.
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        // Cria uma lista específica de círculos e adiciona instâncias de Circle.
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        // Calcula e imprime a área total dos círculos.
        System.out.println("Total area: " + totalArea(myCircles));
    }

    // Método genérico para calcular a área total de uma lista de objetos que estendem Shape.
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area(); // Soma as áreas de cada forma na lista.
        }
        return sum;
    }
}