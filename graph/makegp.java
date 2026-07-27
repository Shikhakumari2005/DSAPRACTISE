import java.util.Scanner;

public class makegp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] b=new int[1000][1000];
        for (int i = 1; i <= m; i++) {
            // Taking input for an undirected graph.
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            b[x][y] = 1;
            b[y][x] = 1;
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 1) {
                    c++;
                }
            }
            System.out.println(i + " " + c);
        }
    }
}