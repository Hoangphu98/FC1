
package Lec6_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ToDoListManagement {
    public static void main(String[] args) {
        ArrayList<String>task = new ArrayList <>();
        task.add("Do homework");
        task.add("Go Shopping");
        System.out.println(Arrays.toString(task.toArray()));
        System.out.println(task.get(0));
        System.out.println(task.remove(0));
        System.out.println(Arrays.toString(task.toArray()));
    }
}
