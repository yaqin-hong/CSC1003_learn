public class reverse {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[a.length];
        a[0] = Integer.parseInt(args[0]);
        a[1] = Integer.parseInt(args[1]);
        a[2] = Integer.parseInt(args[2]);
        a[3] = Integer.parseInt(args[3]);
        a[4] = Integer.parseInt(args[4]);
        
        for (int i = 0; i<5; i++) {
            b[i] = a[4-i];
            System.out.print(b[i] + " ");
        }
        
    }
    
}
