package tutorial1;


//---------This is for inheritance and objects-------
public class Main {
    public static void main(String[] args) {
        Cat tim = new Cat("tim", 12, 100);
        tim.speak();
        Cat bob = new Cat("bob", 7);
        bob.speak();
        Cat joe = new Cat("joe");
        joe.speak();

        Dog d = new Dog("tim", 4);
        d.speak();

//-----------Stundent Class--------------------------
        Student anbu = new Student("anbu");
        Student Bill = new Student("Bill");
        Student Tim = new Student("Tim");

        System.out.println(Bill.equals(Tim));
        System.out.println(Bill.compareTo(Tim));
        System.out.println(Bill.compareTo(Tim) < 0);
        System.out.println(Tim.toString());

//-------------------------innerclass-----------------------
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();

        in.display();
    }
}
