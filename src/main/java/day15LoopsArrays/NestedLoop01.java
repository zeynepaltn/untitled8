package day15LoopsArrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
        /*
                    1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        //Nested for loop
        for(int i=1;i<5;i++){
            System.out.println("week: "+i);

            for(int k=1;k<8;k++){
                System.out.println("\tday: "+k); //\t day in onunde 1 tab bosluk birakir

            }
        }
        //Nested while loop
        int i=1;
        while(i<5) {
            System.out.println("week: " + i);
            int k = 1;
            while (k < 7) {
                System.out.println("\tday: " + k);
                k++;
            }

            i++;
        }
            //nested loop genelde for loop ile kullanilir
            /*
                        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
             */
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter number of rows");
            int rows = input.nextInt();
            System.out.println("Please enter number of columns");
            int columns = input.nextInt();

            for(int r=1; r<=rows; r++){

                for(int c=1; c<=columns; c++){
                    System.out.print("*");
                }
                System.out.println();

            }
        /* 3. Example:TYPE CODE TO GET THE OUTPUT LIKE
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        System.out.println("Please enter row number");
        int row= input.nextInt();
        for(int m=1;m<=row;m++){
            for(int n=1;n<=m;n++){
                System.out.print(n+" ");

            }
            System.out.println();
        }





    }
}
