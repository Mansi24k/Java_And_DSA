// In a program,input 3 numbers: A, B and C.You have to output the average of these 3 numbers

import java.util.*;

public class Que1 {
    public static void main(String args[]){
        int A,B,C;
        float Average;
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the value of 3 Numbers:");
        A = Sc.nextInt();
        B = Sc.nextInt();
        C = Sc.nextInt();
        Average = A+B+C/3;
        System.out.println("Average oF 3 Numbers is:"+" "+Average);
    }
}
