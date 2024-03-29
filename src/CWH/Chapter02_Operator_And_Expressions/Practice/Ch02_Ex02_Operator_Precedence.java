package CWH.Chapter02_Operator_And_Expressions.Practice;

public class Ch02_Ex02_Operator_Precedence {
    public static void main(String[] args) {
        // Precedence & Associativity

        int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. they are then evaluated on the basis of left to right associativity
         = 30-34/2
         =30-17
         =13
         */
        System.out.println(a);

        int b = 60/5-34*2;
        /*
         =12-34*2
         =12-68
         =-56
        */
        System.out.println(b);

        // Quick Quiz

        int x = 6;
        int y = 1;
        int k = x * y / 2;
        System.out.println(k);

        a = 5;
        b = 1;
        int c = 4;
        k = (b*b - 4*a*c) / (2*a);
        System.out.println(k);

    }
}
