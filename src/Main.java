import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int roads = 0;
        if (N > 100 || N <= 0) {
            System.out.println("Неверное кол-во городов");
        }
        else {
            int[][] board = new int[N][N];
            for (int i = 0; i < board.length; i++) {
                for (int j = i; j < board[i].length; j++) {
                    board[i][j] = (int)Math.floor(Math.random() * 2);
                    board[j][i] = board[i][j];
                    if (i == j) {
                        board[i][j] = 0;
                    }
                    if (board[i][j] == 1) {
                        roads++;
                    }
                }
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(roads);
        }
    }
}