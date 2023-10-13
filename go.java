import java.util.Scanner;
public class go {
    public static void PrintBoard(byte[][] piece) {
        int x;
        int y;
        System.out.print("  ");
        for (int i=65; i<=72; i++) {
            System.out.print((char) i+" ");
        }
    
        for (int i=74; i<=84; i++) {
            System.out.print((char) i+" ");
        }
        System.out.println();

        y=19;
        for (y=19; y>=18; y--) {
            System.out.print(y);
            for (x=1; x<=19; x++) {
                if (piece[x][y]==1) System.out.print("A");
                else if (piece[x][y]==-1) System.out.print("B");
                else if (y==19) {
                    if (x==1) System.out.print()
                }
            }
        }
    
        boolean blacksTurn=true;
        int counter = 1;
        while (true) {
            System.out.println("tui shu tui");
            System.out.print("di"+counter+"bu");
            if (blacksTurn) {
                System.out.print("hei");
                String co = new String(s.next());
                piece = ReadMove(piece,co, blacksTurn:true);

            }
        }
    
    
    
    
    
    
    }
}
