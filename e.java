public class e {
    public static void main(String[] args) {
        int n=10;
        double p=0.3;

        int b=0;
        int count=0;

        for(int i=0; i<10000000; i++) {
            b=0;
            while (b>-n&&b<n) {
            if (Math.random()<p) {
                b++;
            }
            else {b--;}
            count++;

        }

       
        }
        System.out.print((double)count/10000000);
    }

    
}
