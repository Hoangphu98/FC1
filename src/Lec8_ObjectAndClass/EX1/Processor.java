package Lec8_ObjectAndClass.EX1;

public class Processor {

    public static void main(String[] args) {
        Car myCar = new Car("Lamborghini", 2020);
        Car myCar2 = new Car("VinFast Lac Hong",2025);
        myCar.displayDetails();
        myCar2.displayDetails();
    }
}
