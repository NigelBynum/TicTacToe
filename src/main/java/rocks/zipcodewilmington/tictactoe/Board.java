package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board { // class decloration

    //typr = Character brackets [] = array board = name of the 2d array of characters
    Character[][] board; // Declaring board which is an 2d array if Characters  also instance variable every board will have rows and collums

    public Board(Character[][] matrix) {
        this.board = matrix; // constructor ,
    }

    public Boolean isInFavorOfX() {
        // check vertical
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                {
                    if (j == 2) {
                        return true;
                    }
                    if (this.board[j][i] == 'X' && this.board[j + 1][i] == 'X') {
                        continue;
                    } else
                        break;
                }
            }
        }
        // check horizontal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                {
                    if (j == 2) {
                        return true;
                    }
                    if (this.board[i][j] == 'X' && this.board[i][j + 1] == 'X') {
                        continue;
                    } else {
                        break;
                    }
                }
            }
            // check diagonally
            if ((this.board[0][0] == 'X' && this.board[1][1] == 'X' && this.board[2][2] == 'X') ||
                    (this.board[2][0] == 'X' && this.board[1][1] == 'X' && this.board[0][2] == 'X')
            ) {
                return true;
            }
        }
        return false;
    }

    // && is equal to (can be used on primitive types)
    // ||=OR
    public Boolean isInFavorOfO() {
        // check vertical
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                {
                    if (j == 2) {
                        return true;
                    }
                    if (this.board[j][i] == 'O' && this.board[j + 1][i] == 'O') {
                        continue;
                    } else
                        break;
                }
            }
        }
        // check horizontal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                {
                    if (j == 2) {
                        return true;
                    }
                    if (this.board[i][j] == 'O' && this.board[i][j + 1] == 'O') {
                        continue;
                    } else {
                        break;
                    }
                }
            }
            // check diagonally
            if ((this.board[0][0] == 'O' && this.board[1][1] == 'O' && this.board[2][2] == 'O') ||
                    (this.board[2][0] == 'O' && this.board[1][1] == 'O' && this.board[0][2] == 'O')
            ) {
                return true;
            }
        }
        return false;
    }

    // && is equal to (can be used on primitive types)
    // ||=OR
    public Boolean isTie() {
        if ((isInFavorOfO() == true && isInFavorOfX() == true) || (isInFavorOfX() == false && isInFavorOfO() == false)) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        String winner = "";

        if (isInFavorOfO() == true && isInFavorOfX() == false) {
            winner += "O";
        } else if (isInFavorOfO() == false && isInFavorOfX() == true) {
            winner += "X";
        }
        return winner;
    }
}




















