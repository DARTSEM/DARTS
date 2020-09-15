package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class feature6 {


    public static void main (String[] args) {
        /** gameID (variable) = the game's ID as a placeholder until we get all assorted
        * Method connecting feature 5 and 6 should go first in the code
        *
        */

        // Starts epic features
        rentGame();
        returnGame();
        rentProfit();

    }


    public static void rentGame(){
        //EPIC FEATURE 6.1 "RENTING GAME"

        //PLACEHOLDER FOR ARRAY LIST
        int[] gameID = {0, 1, 2, 4, 5, 6, 7, 8, 9, 10};

        //Checking if value is in array
        Boolean check = IntStream.of(gameID).anyMatch(x -> x == 0); //might need polishing
        if (check) {
            System.out.println("Game with id "+ check +" not found."); //Value not shown properly (?)

        } else {
            System.out.println("Game with id "+ check +" is already rented.");
        }

    }

    public static void returnGame (){
        Scanner gameID2 = new Scanner(System.in);
        Scanner dayNumber = new Scanner(System.in);
        // USER STORY 6.2 "RETURN GAME"
        /** 1) enter ID of games to return
         * 2) enter number of days game was rented
         * 3) show amount of money based on daily rent fee (returned game)
         * store and inform total rent (ex. 49.50 x 5 = 247.50 SEK)
         */

        //ID of return game
        System.out.println("Enter the id of the game you wish to return: ");
        int gameReturn = gameID2.nextInt();

        //Number of days rented
        System.out.println("How many days was your game rented? ");
        int daysRented = dayNumber.nextInt();



    }

    public static void rentProfit(){
        // USER STORY 6.3

    }







}
