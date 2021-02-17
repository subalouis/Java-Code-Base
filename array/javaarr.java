import java.util.Scanner;
public class javaarr {
    public static void main (String args []){
    Scanner sc = new Scanner (System.in);
       int[] loop = new int [21];
       System.out.println("Enter an integer from 1 to 20:"); 
       for (int i=0;i<20;i++){
           loop[i]=sc.nextInt();
       }
    System.out.print("List of array elements: ");
    for(int i=0; i<=20; i++){
    System.out.print(loop[i] + " ");
    }

    System.out.print("\n\nList of array elements in reversed order: ");
    for (int i = 20 - 1; i >= 0; i--) {
        System.out.print(loop[i] + " ");
    }

    System.out.print("\n\nList of array elements of even numbers: ");
    for(int i=1; i<=20; i++){
        if(loop[i] % 2 == 0 && loop[i]!=0){
    System.out.print(loop[i] + " ");
        }
    }

    System.out.print("\n\nList of array elements of odd numbers: ");
    for(int i=1; i<=20; i++){
        if(loop[i] % 2 !=0){
    System.out.print(loop[i] + " ");
    
            }
        }
    }
}
