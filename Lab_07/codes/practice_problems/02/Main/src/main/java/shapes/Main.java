/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package shapes;
import java.util.ArrayList;
/**
 *
 * @author ANIK
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Creating Circle objects
        Circle circle1 = new Circle("Circle1", "Red", 5.0);
        Circle circle2 = new Circle("Circle2", "Blue", 3.0);

        // Creating Rectangle objects
        Rectangle rectangle1 = new Rectangle("Rectangle1", "Green", 4.0, 6.0);
        Rectangle rectangle2 = new Rectangle("Rectangle2", "Yellow", 5.0, 7.0);

        // Adding shapes to the ArrayList
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        // Displaying shape information
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}