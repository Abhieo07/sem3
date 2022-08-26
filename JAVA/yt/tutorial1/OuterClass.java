package tutorial1;

public class OuterClass {
    public class InnerClass {
        public Void display() {
            System.out.println("This is an inner class");
            return null;
        }
    }

    public void inner() {
        InnerClass in = new InnerClass();
        in.display();
    }
}
