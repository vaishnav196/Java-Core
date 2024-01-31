abstract class Mammals {
    public abstract void walk();

    public abstract void eats();

    public void color() {
        System.out.println("color is black");
    }
}

class Horse extends Mammals {
    public void walk() {
        System.out.println("walking on four legs");
    }

    public void eats() {
        System.out.println("eating green grass");
    }
}

class A {
    public void show() {
        System.out.println(" Class A function A");
    }

    int age;

    static class B {
        public void show1() {
            System.out.println("Class B function");
        }

    }

}

interface Computer {
    void coding();

}

class Laptop implements Computer {
    public void coding() {
        System.out.println("Coding with laptop");
    }
}

class Desktop implements Computer {
    public void coding() {
        System.out.println("Coding with deskTop");
    }
}

class Coder {
    public void buildApp(Computer desk) {
        desk.coding();
    }
}


enum Status{
    Pending,Success,Failed,Running
}


interface C{
   void show(); 
}

public class Demo1 {
    public static void main(String[] args) {
        Mammals m = new Horse();
        m.walk();
        m.eats();
        // this is example of INNER class
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.show1();

        // interface example
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Coder c = new Coder();
        c.buildApp(desk);

        C object1 = ()->
        {
                System.out.println("this is Show ");
        };
      

        // enum example
   Status s=Status.Failed;
switch(s){
    case Running:
    System.out.println("Running now ");
    break;
    case Pending:
    System.out.println("Please Wait its Pending");
    break;
    case Success:
    System.out.println("Good All Done");
    break;
    case Failed:
    System.out.println("Sorry Try again");
    break;
}





    }
}
