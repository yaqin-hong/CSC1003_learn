public class Array{
    public static void main(String[] args) {
        int[] a;
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i * 10;
        }
        System.out.println("a number"+ a.length);

        System.out.print("a elements");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}