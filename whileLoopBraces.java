public class whileLoopBraces{
    public static void main(String[] args) {
        int i = 0;
        while(i < 2){
            i++;
            System.out.println("This is the first loop.");
        }
        i = 0;
        while(i < 2)
            i++;
        System.out.println("This is the second loop.");
        // As you can see, the second loop will only execute one statement after the while() in the loop.
    }
}