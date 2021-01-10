package pirmas;
/*
    1.Akmuo
    2.Zirkles
    3.Popierius
    0.Pabaiga
*/


import java.util.Scanner;

public class NamuDarbas2 {
    public static void main(String[] args) {
        
        System.out.println("1. Akmuo");
        System.out.println("2. Zirkles");
        System.out.println("3. Popierius");
        System.out.println("0. Pabaiga");
        Scanner sc = new Scanner(System.in);
        System.out.print("Your move : ");
        int myChoice = sc.nextInt();
        
        //Vertify that myMove is valid
        while ( myChoice > 3) {
            System.out.println("Selected number " + myChoice + " cannot be greater than 3.");
            break;
        }
        //Random generate
        int compChoice = (int) (Math.random() * 3) + 1;
        /*
        0.23 * 3 = 0.69 > 0 > 1
        0.51 * 3 = 1.53 > 1 > 2
        0.8 * 3 = 2.4 > 2 > 3
        */
        System.out.print("Opponent move : " + compChoice);
        System.out.println("");
        if (compChoice != myChoice ) {
            
        }
    
    }
}