package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
        Scanner input = new Scanner(System.in);

    int n;

        System.out.print("Sayi gir : ");
        n = input.nextInt();

        for (int i=1; i <=n; i++){
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }

       */
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi gir :");
        int n = input.nextInt();


        for ( int i = 1; i<=n; i++){
            for (int x = 1; x<= (n-i); x++){
                System.out.print(" ");
            }
            for (int y = 1; y<=(2*i)-1; y++){
                System.out.print("*");
            }
            System.out.println();
        }




        for (int z = (n-1); z>=1; z--){
            for (int w =1; w<=(n-z); w++ ){
                System.out.print(" ");
            }
            for (int v= (2*z)-1; v>=1; v--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
