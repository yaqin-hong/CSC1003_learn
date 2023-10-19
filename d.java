public class d {
    public static void main(String[] args) {
        int n = Integer.parseInt (args[0]);
        int d = 10000;
        
        int[] a = new int[d];
        int[] b = new int[d];
        a[0] = 1;  //fib(0)
        b[0] = 1;  //fib(1)

        int[] c = new int[d];
        //calculate fib(n)  n>=2
        for (int i = 2; i < n; i++) {
            //a = a+b; c = b; b=a ;a=c;
            int carry = 0;
        
            for (int j = 0; j < d; j++) {
                a[j] = a[j] + b[j] + carry;
                if (a[j] < 10) {
                    carry = 0;
                }else {
                    carry = 1;
                    a[j] = a[j] - 10;
                }
            }
            int[] c = b;
            b = a;    //b只储存fib（n)最大值
            a = c;
        }

        for (i = d-1; b[i]==0; i--) //find the 1st nonzero element in b 最高位是d-1，找高位第一个非零数
        for (int j = i; j >= 0; j--) 
            System.out.print(b[j]);
    }
}
