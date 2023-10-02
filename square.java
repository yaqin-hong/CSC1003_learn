public class square{
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);

        double p=0;
        double q=2*n;
        double r=(p+q)/2;

        while (Math.abs(r*r -n)>1e-6){
            if (r*r>n){
                q=r;
            }else{
                p=r;
            }
            r=(p+q)/2;
        }
    
        System.out.println("root"+n+"is"+r);
    }
}