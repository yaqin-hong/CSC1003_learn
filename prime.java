public class prime {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b;

        for(int i = a; i>0; i--) {
            b = 0;
            for (int j =2; j<i; j++) {
                if(i % j==0){
                    b=1;
                    break;
                }
            }
            if (b==0) {
                System.out.print(i);
            }
        }
    
    }
    
}
