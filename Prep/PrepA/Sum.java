import java.util.Scanner;
/*
Start main program
*/
public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the first number");
        double Num1 = input.nextDouble();
        System.out.println("Give me the second number");
        double Num2 = input.nextDouble();
        double Sum = sum(Num1, Num2);
        System.out.println(Num1 + "+" + Num2 + "=" + Sum);
    }

    public static double sum(double i, double j){
        double sum = i + j;
        return sum;
    }
}