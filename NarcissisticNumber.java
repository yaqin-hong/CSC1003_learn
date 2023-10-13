public class NarcissisticNumber {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        for(int i = 100; i < 1000; i++){
            int m = i / 100;
            int n = i % 100 / 10;
            int p = i - m * 100 - n * 10;
            if (m * m * m + n * n * n + p * p * p == i){
                arr[count] = i;
                count++;
            }
        }
        System.out.print("[");
        for(int i = 0; i < count; i++){
            System.out.print(arr[i]);
            if(i != count - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}
