
class A{

  void starts(){
      System.out.println("Starts the run");
  }
}

class B extends A{

    void running(){
        System.out.println("keep running");
    }
}

public class SingleInheritance {

    public static void main(String[]args){

        B b = new B();

        b.starts();
        b.running();

    }
}
