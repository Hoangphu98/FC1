
package Lec10.Abstractclass.All;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Barks Barks");
    }
}
