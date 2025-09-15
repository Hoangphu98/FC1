
package Lec9_InheritanceAndPolymorphism.Method;

public class Husky extends Dog {
    void displayInformation(){
        super.displayPrice();
        System.out.println("Huksy's price is 1500 USD");
    }
}
