package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;

// Question 11 : Repeat Que02 using for loop

import java.util.Scanner;

public class Ch05_Que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum = sum + (2*i);
        }
        System.out.println("The Sum of first " + n + " even numbers is " + sum);
    }
}
