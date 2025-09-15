
package Lec8_ObjectAndClass.MethodOverLoading.Order;

public class Order {
    public static void printInfor(String name, int age){
        System.out.println("Name: "+name+",Age: "+age);
    }
    public static void printInfor(int age,String name){
        System.out.println("Age: "+age+",Name: "+name);
    }
}
