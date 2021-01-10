package pirmas;

import java.util.Scanner;

public class NamuDarbas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myChoice;
        int compChoice;
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        
        //zmogaus statistika
        int totalGameNumber = 0;
        int myTotalWins = 0;
        int totalCompWins = 0;
        int totalTies = 0;
        int myTotalRocks = 0;
        int myTotalPaper = 0;
        int myTotalScissors = 0;
        int compTotalRocks = 0;
        int compTotalPaper = 0;
        int compTotalScissors = 0;

        do {
            System.out.println("1 Rock\n2 Paper\n3 Scissors\n0 to quit");
            System.out.print("Your move : ");
            //user and computer choices
            myChoice = sc.nextInt();
            compChoice = (int) (Math.random() * 3) + 1;
            
            while (myChoice > 3) {
            System.out.println("Selected number " + myChoice + " cannot be greater than 3.");
            System.out.println("1. Rock \n2. Scissors \n3. Paper");
            System.out.println("Choose your number again: ");
            myChoice = sc.nextInt();
            }
            if (totalGameNumber == 0 && myChoice == 0) {
                System.out.println("Sorry to see you go :( \nBye! ");
                   return;
            } else if (myChoice == 0){
                System.out.println("========");
                System.out.println("Sorry to see you go! Some statistics for you below!");
                System.out.printf("\n- Total games played: %d\n", totalGameNumber);
                System.out.printf("- Total games you won: %d\n", myTotalWins);
                System.out.printf("- Total games computer won: %d\n", totalCompWins);
                System.out.printf("- Total ties: %d\n", totalTies);
                System.out.println("======================");
                System.out.printf("- You chose Rock: %d times ( %d%% )\n", myTotalRocks, choicePercentage(myTotalRocks, totalGameNumber));
                System.out.printf("- You chose Paper: %d times ( %d%% )\n", myTotalPaper, choicePercentage(myTotalPaper, totalGameNumber));
                System.out.printf("- You chose Scissors: %d times ( %d%% )\n", myTotalScissors, choicePercentage(myTotalScissors, totalGameNumber));
                System.out.printf("\n- Computer chose Rock: %d times ( %d%% )\n", compTotalRocks, choicePercentage(compTotalRocks, totalGameNumber));
                System.out.printf("- Computer chose Paper: %d times ( %d%% )\n", compTotalPaper, choicePercentage(compTotalPaper, totalGameNumber));
                System.out.printf("- Computer chose Scissors: %d times ( %d%% )\n", compTotalScissors, choicePercentage(compTotalScissors, totalGameNumber));
                return;
            }
           
            if (myChoice == rock) {
                myTotalRocks++;
                if (compChoice == rock) {
                    compTotalRocks++;
                    System.out.println("Rock vs Rock: Tie game");
                    totalTies++;
                    totalGameNumber++;
                } else if (compChoice == paper) {
                    compTotalPaper++;
                    System.out.println("Rock vs Paper: You Lose");
                    totalCompWins++;
                    totalGameNumber++;
                } else if (compChoice == scissors) {
                    compTotalScissors++;
                    System.out.println("Rock vs Scissors: You Win");
                    myTotalWins++;
                    totalGameNumber++;
                }
            } else if (myChoice == paper) {
                myTotalPaper++;
                if (compChoice == rock) {
                    compTotalRocks++;
                    System.out.println("Paper vs rock: You win");
                    myTotalWins++;
                    totalGameNumber++;
                } else if (compChoice == paper) {
                    compTotalPaper++;
                    System.out.println("Paper vs papper: Tie game");
                    totalTies++;
                    totalGameNumber++;
                } else if (compChoice == scissors) {
                    compTotalScissors++;
                    System.out.println("Paper vs scissors: You Loose");
                    totalCompWins++;
                    totalGameNumber++;
                }
            } else if (myChoice == scissors) {
                myTotalScissors++;
                if (compChoice == rock) {
                    compTotalRocks++;
                    System.out.println("Scissors vs rock: You loose");
                    totalCompWins++;
                    totalGameNumber++;
                } else if (compChoice == paper) {
                    compTotalPaper++;
                    System.out.println("Scissors vs paper: You win");
                    myTotalWins++;
                    totalGameNumber++;
                } else if (compChoice == scissors) {
                    compTotalScissors++;
                    System.out.println("Scissors vs scissors: Tie game");
                    totalTies++;
                    totalGameNumber++;
                }
            }
            System.out.println("");
         
        }while (myChoice > 0);
    }
     static int choicePercentage(int choiceNumber, int games) {
        double percentage = Math.round((double) choiceNumber / games * 100);
        return (int) percentage;
     }
        
    }
