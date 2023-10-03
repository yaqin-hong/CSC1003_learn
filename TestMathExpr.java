import java.util.*;

public class TestMathExpr {

    static Scanner input = new Scanner(System.in);
    static int[] d;

    // here is the function you need to implement
	public static void parse_line(int j, String s1, String s2, String s3) {
        int a=Integer.parseInt(s1);
        int c=Integer.parseInt(s3);
        if (s2.equals("+"))
        { d[j] = a + c; }
            //System.out.println(a+c);
        if (s2.equals("-"))
        { d[j] = a - c; }
            //System.out.println(a-c);}
        if (s2.equals("*"))
        { d[j] = a * c; }
            //System.out.println(a*c);}
        if (s2.equals("/"))
        { d[j] = a / c; }
            //System.out.println(a/c);}
    }     
        

    public static void main(String[] args) throws Exception {
        int line_number = Integer.parseInt(input.nextLine()); 
        d=new int[line_number];
        for(int i=0; i<line_number; i++) {
            String s = input.nextLine();
            String t[] = s.split(" ");
            TestMathExpr.parse_line(i, t[0], t[1], t[2]);
        }
        for(int i=0; i<line_number; i++) {
            System.out.print(d[i]);
        }
    }
}