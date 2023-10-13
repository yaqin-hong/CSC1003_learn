import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.close();

        if(m < 5){
            System.out.println("m < 5");
        }else if(m < 8){
            System.out.println("5 <= m < 8");
        }else if(m < 4){
            System.out.println("This line will never be printed.");
        }else if(m > 6){
            System.out.println("m >= 8");
        }else{
            System.out.println("This line will not be printed, either.");
        }


        if(m < 5){
            System.out.println("M < 5");
        }else{
            // nested
            if(m < 8){
                System.out.println("5 <= M < 8");
            }else{
                System.out.println("M >= 8");
            }
        }
    }
}
