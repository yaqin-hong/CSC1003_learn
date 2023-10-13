public class Divisible {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a % b == 0 || b % a == 0) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
        
    }
}