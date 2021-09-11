/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Use class scanner

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Use scanner to obtain input
        System.out.println("Hello! \nPlease answer (yes/y) or (no/n) for the following questions.");
        System.out.println("Is the car silent when you turn the key? ");
            String ans = sc.nextLine(); //Obtain input from the user
            //Using if-else statement
            if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {  //if user input is yes/y
                System.out.println("Are the battery terminal corroded?");
                String ans2 = sc.nextLine();    //Obtain input from the user
                //Using nested if-else statement
                if (ans2.equalsIgnoreCase("yes") || ans2.equalsIgnoreCase("y")) { //if user input is yes/y
                    System.out.println("Clean the terminals and try again.");   //This message will be displayed
                } else {   //if user input is no/n
                    System.out.println("Replace the cables and try again.");    //This message will be displayed
                }
            } else {  //If user input is no/n
                System.out.println("Does the car make a slicking noise? ");
                String ans3 = sc.nextLine();    //Obtain input from the user
                //Using nested if-else statement
                if (ans3.equalsIgnoreCase("yes") || ans3.equalsIgnoreCase("y")) {    //If user input is yes/y
                    System.out.println("Replace the battery."); //This message will be displayed
                } else {  //If user input is no/n
                    System.out.println("Does the car crank up but fail to start?");
                    String ans4 = sc.nextLine();    //Obtain input from the user
                    //Using nested if-else statement
                    if (ans4.equalsIgnoreCase("yes") || ans4.equalsIgnoreCase("y")) {    //If user input is yes/y
                        System.out.println("Check the spark plug connections.");    //This message will be displayed
                    } else {  //if user input is no/n
                        System.out.println("Does the engine start and then die?");
                        String ans5 = sc.nextLine();    //Obtain input from the user
                        //Using nested if-else statement
                        if (ans5.equalsIgnoreCase("yes") || ans5.equalsIgnoreCase("y")) { //If user input is yes/y
                            System.out.println("Does your car have fuel injection?");
                            String ans6 = sc.nextLine();    //Obtain input from the user
                            if (ans6.equalsIgnoreCase("yes") || ans6.equalsIgnoreCase("y")) { //If user input is yes/y
                                System.out.println("Get if for service.");  //This message will be displayed
                            } else {  //If user input is no/n
                                System.out.println("Check to ensure the choke is opening and closing.");    //This message will be displayed
                            }
                        } else {    //If user inputs is no/n
                            System.out.println("This should not be possible.");
                        }

                    }
                }
            }
    }
}
