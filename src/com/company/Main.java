package com.company;

/** A simple program commonly used in the betting world for calculation the rollover amount in a given period of time
 * @author Felix Ogbonnaya
 * @since 2019-02-15
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int days;
        double odds;
        double amount;

        System.out.println("How much: ");
        amount = input.nextInt();

        System.out.println("How many days: ");
        days = input.nextInt();

        System.out.println("How many odds: ");
        odds = input.nextDouble();


        for(int i = 1; i<=days; i++ ){
            amount = amount * odds;
            System.out.println("Day "+ i + "= " + amount);
        }

    }

}
