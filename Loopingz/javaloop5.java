import java.util.Scanner;
public class javaloop5 {
    public static void main (String args[]){
        int sum=0;

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Start: "); int start=sc.nextInt();
        System.out.println("Enter End: "); int end=sc.nextInt();
        System.out.print("\n");
        do{
            System.out.println(start);
            sum += start;
            start++;

        }while(start<=end);
        System.out.print("Sum of in range values: " + sum);
    }
}
