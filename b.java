public class b{

    static Scanner input = new Scanner(System.in);

    public static void parse_line(int n, int d){
        int[] a = new int[n];
        a[0]=1;
        a[1]=1;
        for (int i=2; i<n; i++){
            a[i] = a[i-1] + a[i-2];
            
        }
        

    }
    public static void main(String[] args)throws Exception{
        int line_number = Integer.parseInt(input.nextLine());
        for(int i=0; i<line_number; i++){
            String s = input.nextLine();
            String t[] = s.split(regex:", ");
            int n = Integer.parseInt(t[0]);
            int d = Integer.parseInt(t[1]);
            b.parse_line(n,d);
        }
    }
}