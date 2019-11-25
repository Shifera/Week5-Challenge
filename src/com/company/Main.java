package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       String nameInput;
        int accountInput;
        int dateInput;
        int addressInput;

        Scanner input=new Scanner(System.in);


        System.out.println("Enter your name");
        nameInput=input.nextLine();

        System.out.println("Enter your street address");
        addressInput=input.nextInt();

        System.out.println("Enter date");
        dateInput=input.nextInt();
        System.out.println("Enter your account number");
        accountInput=input.nextInt();
    }
    for(String x : Item) {
        System.out.println(x);
    }
    for(String y : Invoice) {
        System.out.println(y);
    }
}
