package pirmas;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("nuo");
        int nuo = sc.nextInt();
        
        System.out.println("iki");
        int iki = sc.nextInt();
        
        int c = nuo;
        int d = iki - nuo + 1; //sito nereik
        //while(c<=iki){}
        while (nuo <= iki) {
            //int i = nuo;
            //while(i<=iki){}
            while (c<= iki) {
                System.out.print(c * nuo + " "); //i*nuo
                ++c; //i++
        }
            System.out.println();
            ++nuo; //c++
            c = c-d; //tada sito nereik
        }
    }
}
