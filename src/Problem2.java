/**
 * Created by dongweij on 2015/8/10.
 */
public class Problem2 {

    public static void hasWon(char[][] board) {
        boolean Owon = false, Xwon = false;
        int Ototal = 'O' * 3;
        int Xtotal = 'X' * 3;
        int i, j;
        //check rows
        for(i = 0; i < 3; i++) {
            int temprow = 0;
            for(j = 0; j < 3; j++) {
                temprow += board[i][j];
            }
            if(temprow == Ototal) {
                Owon = true;
            }
            if(temprow == Xtotal) {
                Xwon = true;
            }
        }
        //check columns
        for(i = 0; i < 3; i++) {
            int tempcolumn = 0;
            for(j = 0; j < 3; j++) {
                tempcolumn += board[j][i];
            }
            if(tempcolumn == Ototal) {
                Owon = true;
            }
            if(tempcolumn == Xtotal) {
                Xwon = true;
            }
        }
        //check diagonals
        int tempdiag = board[0][0] + board[1][1] + board[2][2];
        if(tempdiag == Ototal) {
            Owon = true;
        }
        if(tempdiag == Xtotal) {
            Xwon = true;
        }
        //check antidiagonals
        int tempantidiag = board[0][2] + board[1][1] + board[2][0];
        if(tempantidiag == Ototal) {
            Owon = true;
        }
        if(tempantidiag == Xtotal) {
            Xwon = true;
        }
        //output the result
        if(Owon && Xwon) {
            System.out.println("Both Won!");
        }
        else if(Owon && !Xwon) {
            System.out.println("Owon!");
        }
        else if(!Owon && Xwon) {
            System.out.println("Xwon!");
        }
        else {
            System.out.println("Neither Won!");
        }
    }

    public static void main(String[] args) {
        //Tic-tac-toe is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3¡Á3 grid.
        // The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.
        char[][] board = {{'O', ' ', 'X'}, {' ', 'O', 'O'}, {'X', 'X', 'X'}};
        hasWon(board);
    }

}
