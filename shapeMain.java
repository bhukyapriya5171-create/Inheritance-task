package inheritanceatask;

public class shapeMain {

	public static void main(String[] args) {
		Shape circle = new Circle(5);
//        System.out.println(circle.calculateArea());
        System.out.println(((Circle) circle).calculateCircleArea());

        Shape rectangle = new Rectangle(4, 6);
//        System.out.println(rectangle.calculateArea());
        System.out.println(((Rectangle) rectangle).calculateRectangleArea());

        Shape triangle = new Triangle(3, 7);
//        System.out.println(triangle.calculateArea());
        System.out.println(((Triangle) triangle).calculateTriangleArea());
    }

       

	}


