import java.util.Scanner;
public class isRen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a Number - Year");
        int year = sc.nextInt();
        System.out.println("Please input a Number - Month");
        int month = sc.nextInt();

        boolean isRen;
        if (((year%4==0)&(year%100!=0))||(year%400==0)){
            System.out.println("is Ren!");
            isRen = true;
        }else{
            System.out.println("not Ren!");
            isRen = false;
        }
    }
}