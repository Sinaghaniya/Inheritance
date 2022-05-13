
class A1{

    void starts(){
        System.out.println("starts the run");
    }
}

class B1 extends A1{
    void running(){

        System.out.println("keep running");
    }
}

class C extends B1{

    void stops(){

        System.out.println("Stops the run");
    }
}


public class MultilevelInheritance {

    public static void main(String[]args){

        C c = new C();

        c.starts();
        c.running();
        c.stops();

    }
}
