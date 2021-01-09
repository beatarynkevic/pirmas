package pirmas;

import java.util.Scanner;

public class NamuDarbas1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("nuo:");
        int nuo = sc.nextInt();
        
        System.out.println("iki:");
        int iki = sc.nextInt();
        
        int i = nuo;
        while (i <= iki){
            int j = nuo;
            while (j <= iki) {
                System.out.print(i * j + " ");
                j += 1;
            }
            System.out.println();
            i += 1;
        }
        
        
    }
}