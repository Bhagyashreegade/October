package com.company;

public class ConceptOfLoop {

    public static void main(String[] args) {

        //for loop & nested for loop

        //1)  print numbers 1 to 10
            /*for (int i=1; i<=10; i++){
            System.out.println(i);*/


        //2)  print numbers 10 to 1
            /*for (int j=10; j>=1; j--){
                System.out.println(j);
            }*/

        //3)  print 1 to 9 in square

               /* int a= 1;
            for (int x=1; x<=3; x++){  //represent row
                for(int y= 1; y<=3; y++){    //represent column
                    System.out.print(a   +  "  ");
                    a++;
                }
                System.out.println("");
            } */


        //4) while loop--->print numbers 1 to 10 using while loop

        int i = 1;                                  //initialization
        while (i <= 10) {                              //conditional
            System.out.println(i);
            i++;                                     //increment
        }


        //5) do while loop----> will execute once even if the condition in while loop is not satisfied

        System.out.println("The numbers using do-while loop is :   ");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);


    }
}

