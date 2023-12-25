//In a program,input the side of a square.You have to output the area of the square.

import java.util.*;

public class Que2 {
    public static void main(String args[]){
        float side, Area;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value od Side:"+" ");
        side = Sc.nextFloat();
        Area = side * side;
        System.out.println("Area of Square is:"+" "+ Area);
    }
}
