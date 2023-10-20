public class prime1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        boolean[] b = new boolean [a];

        for(int i = 2; i<=(int)Math.sqrt(a); i++) {
            if(b[i-1] == false) {
                for(int j = i; i*j<a+1; j++) {
                    b[i*j] = true;
                }
            }

        }
        
        for(int j = 2; j<a; j++) {
            if(b[j] = false) {
                System.out.print(j);

        }
        
        }
    }
    
}

