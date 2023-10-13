public class a{

    static Scanner input = new Scanner(System.in);

    public static void parse_line(String s1, String s2, String s3){
        int a = Integer.parseInt(s1);
        int c = Integer.parseInt(s3);
        switch (s2){
            case "+":
                System.out.println(a+c);
                break;
            case "-":
                System.out.println(a-c);
                break;
            case "*":
                System.out.println(a*c);
                break;
            case "/":
                System.out.println(a/c);
                break;
            default:
                System.out.println(a-c);

        }
        
        
    }
    public static void main(String[] args) throws Exception{
        int line_number = Integer.parseInt(input.nextLine());
        for(int i=0; i<line_number; i++){
            String s = input.nextLine();
            String t[] = s.split(regex", ");
            a.parse_line(t[0], t[1], t[2]);
        }
    }

}
