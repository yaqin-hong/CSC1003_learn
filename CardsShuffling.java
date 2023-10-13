import java.util.*;

public class CardsShuffling {

    public static void OutputCards(int n){
        //Fill your code here
        int[] deck = new int[n];
        int i=0;
        while (i < n){
            deck[i] = i+1;
            i++;
        }
        
        for (int j = 0; j < n; j++) {
            int r = j + (int) (Math.random()*(n-j));
            int t = deck[r];
            deck[r] = deck[j];
            deck[j] = t;
        }
            
        for (int j = 0; j < n; j++) {
        System.out.print(deck[j]);
        if (j != n+1) System.out.print(" ");
        
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        if(scanner.hasNextInt()) n = scanner.nextInt();
        scanner.close();
        OutputCards(n);
    }

}