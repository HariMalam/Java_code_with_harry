package CWH.Chapter05_Loop_Control_Instruction.PracticeSet;
import java.util.Scanner;

//Question 2 : Write a java program to sum first even numbers using while loop

public class Ch05_Que02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while ( i < n ){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("The Sum of first " + n + " even numbers is " + sum);
    }
}
