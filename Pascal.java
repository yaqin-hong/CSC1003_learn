import java.util.*;

public class Pascal {

    public static void OutputPascalsTriangle(int n){
        //Fill your code here
        int[][] a = new int [50][50];
        a[0][0] = 1;
        a[1][0] = 1;
        a[1][1] = 1;
        
        for (int i=0; i<n; i++) {
            a[i][0]=1;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (j==n-1) a[i][j]=1;       
                a[i][j] = a[i-1][j] + a[i-1][j-1];   
            }
        }

         

        int i = 0;
        int j = 0;
        while (i < n) {
            j=0;
            while (j <= i) {  
                System.out.print(a[i][j]);
                j++;
                if (j != i+1) System.out.print(" ");
            }
        i++;
            System.out.println();
        }
            
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        if(scanner.hasNextInt())
            n = scanner.nextInt();
        scanner.close();
        OutputPascalsTriangle(n);
    }

    
}