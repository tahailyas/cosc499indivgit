package testrun;

import java.util.Scanner;

public class testrun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int temp;

       
        System.out.println("Enter number of elements");
        int size = scan.nextInt();

       
        int[] numA = new int[size];

       
        for (int i = 0; i < size; i++) {
            System.out.print("Enter num to add: ");
            numA[i] = scan.nextInt();
        }

       
        System.out.println("You have entered : ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numA[i] + ",");
        }
        System.out.println(numA[numA.length - 1]);

      
        for (int i = 0; i < numA.length; i++) {
            for (int j = i + 1; j < numA.length; j++) { 

           
            if (numA[i] > numA[j]) {
                    temp = numA[i];
                    numA[i] = numA[j];
                    numA[j] = temp;
                }
            }
        }

        
        System.out.println("Sorted Array");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numA[i] + ",");
        }
        System.out.println(numA[numA.length - 1]);


	}

}
