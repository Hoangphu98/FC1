
package Lec10.Interface.ImplementAndExtends;

public class Circle implements IColor {
    @Override
    public void drawShape(){
        System.out.println("Drawing a circle.");
    }
    public void fillColor(){
        System.out.println("Filling the circle with green");
    }
}
