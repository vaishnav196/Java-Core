 class Human{
  private int age;
  private String name;
public Human(){
    System.out.println("this is human default constructor");
}
public Human(int age,String name){
    this();
    System.out.println("this is human paramterirsed  constructor");
}
  public int GetAge(){
    return age;
  }
  public void SetAge(int age ){
   this.age=age;
  }


  public String GetName(){
    return name;
  }
  public void SetName(String name ){
   this.name=name;
  }


 

 }

 
 class mammals extends Human{
   public mammals(){
    System.out.println("mammal constructor is called ");
   }
 }

 class A{
public void show1(){
  System.out.println("in show of A");
}

 }

 class B extends A{
  public void show2(){
    System.out.println("in show of B");
  }
 }
public class Demo {

 public static void main(String args[]){

    Human h1 = new Human();
    h1.SetAge(30);
    h1.SetName("Ram");

    System.out.print(h1.GetName()+":"+ h1.GetAge());
    Human h2= new Human(5,"sita");

// upcasting
    A obj=(A) new B();
    obj.show1();
// downcasting
    B obj1=(B)obj;
    obj1.show2();
   

 }


  

}

