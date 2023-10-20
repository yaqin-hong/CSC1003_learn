import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String t[] = s.split(" ");
        int[] a = new int[t.length];
        int[] b = new int[t.length];
        input.close();
        
        int j = 0;
        while (j<t.length) {
            a[j] = Integer.parseInt(t[j]);
            j++;
        }
        
        for(int i = 0; i<t.length; i++) {
            b[i] = a[t.length-i-1];
            System.out.print(b[i] + " ");
        }
    }
}
