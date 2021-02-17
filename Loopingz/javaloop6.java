import java.util.Scanner;
public class javaloop6 {

    public static void main (String args[]){
        int n,sum=0,numbers;
        Scanner sc= new Scanner (System.in);
        System.out.println("How many numbers will you enter?"); n=sc.nextInt();
        System.out.println("Enter "+ n + " integers one per line:");

        do{
            numbers=sc.nextInt();
            sum+=numbers;
            n--;
        }while(n!=0);
        System.out.print("The sum is " + sum);
    }
}