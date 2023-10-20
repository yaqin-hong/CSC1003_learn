import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t[] = s.split(" ");
        int n = Integer.parseInt(t[0]);
        int d = Integer.parseInt(t[1]);
        input.close();

        int a = Math.min(n,d);
        for(int i = a; i>=0; i--) {
            if(n % i==0 && d % i==0) {
                System.out.print(i);
                return;

            }

        }

    }

    
}
