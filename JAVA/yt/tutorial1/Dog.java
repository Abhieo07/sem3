package tutorial1;

public class Dog {
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and i am " + this.age);
    }

    public int getAge() {
        return this.age;
    }

}
