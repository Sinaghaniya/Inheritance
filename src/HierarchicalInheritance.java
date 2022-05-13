
class Food{

    void whatFood(){
        System.out.println("What's in Dinner");
    }
}

class VegBiryani extends Food{

    void Veg(){
        System.out.println("VegBiryani");
    }
}

class NonVegBiryani extends Food{

    void NonVeg(){
        System.out.println("ChickenBiryani");
    }
}

public class HierarchicalInheritance {

    public static void main(String[]args){

        Food food = new Food();

        food.whatFood();


        System.out.println();

        VegBiryani vegBiryani = new VegBiryani();

        //vegBiryani.whatFood();
        vegBiryani.Veg();

        System.out.println();

        NonVegBiryani nonVegBiryani = new NonVegBiryani();

        //nonVegBiryani.whatFood();
        nonVegBiryani.NonVeg();
    }
}
