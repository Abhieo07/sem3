package tutorial1;

public class Interface {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.speedUp(10);
        ford.changeGear(2);
        ford.display();
        int x = Vehicle.math(5);
        System.out.println("Static method: "+ x);
    }
}
