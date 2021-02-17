import java.util.Scanner;
import java.util.Arrays;
public class javarr2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        double total=0;
        int[] num= new int [5];
        String[] name = new String[5];
        double[] sales = new double [5];

        for (int i = 0; i<5; i++){
            System.out.print("Enter the Employee Number: "); num[i] = sc.nextInt();
            name[i] = sc.nextLine();
            System.out.print("Enter the Employee Name: "); name[i] = sc.nextLine();
            
            System.out.print("Enter the Amount of Sales: "); sales[i] = sc.nextDouble();
            total += sales[i];
        }

        System.out.println("Employee ID\tEmployee Name\tAmount Sales");
        for (int i = 0; i<5; i++){
            System.out.println(num[i] + "\t\t" + name[i] + "\t   " + sales[i]);
        }
        double ave = total/5;
        Arrays.sort(sales);
        System.out.println("Total Sales: " + total); 
        System.out.println("Average Sales: " + ave); 
        System.out.println("\n\nMaximum Sale: " + sales[sales.length-1]);
        System.out.println("\n\nMinimum Sale: " + sales[0]);

        }
    }

