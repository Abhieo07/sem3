import java.util.Scanner;

abstract class Shape {
    public static int area;
    int width;
    abstract void area();
}

abstract class Square extends Shape {
    public void Shape(int width) {
        Shape.area = width * width;
    }
}

abstract class Circle extends Shape {
    private void area(int width) {
        System.out.println(Math.PI * width * width);
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
    }
}
