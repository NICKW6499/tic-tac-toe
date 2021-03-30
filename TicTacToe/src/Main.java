import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            Player player1 = new Player();
            Player player2 = new Player();

            System.out.println("Welcome to Tic-Tac-Toe!");
            System.out.println("Press enter to begin.");
            Scanner gameScanner = new Scanner(System.in);
            gameScanner.nextLine(); //press enter to progress

            //player 1 information
            System.out.println("Enter Player 1's name:");
            player1.name = gameScanner.nextLine();
            System.out.println("Player 1 choose X or Y (This will be your character for the remainder of the game):");
            player1.icon = gameScanner.nextLine().toUpperCase();

            //Player 2 information
            System.out.println("Enter Player 2's name:");
            player2.name = gameScanner.nextLine();
            if (player1.icon.equals("X")) {
                player2.icon = "Y";
            } else {
                player2.icon = "X";
            }


            GameBoard game = new GameBoard();
            game.printGameBoard(game.gameBoard);

            System.out.println("To mark the board, please choose one of the available numbers not occupied by X or Y");
            int turn = 1;
            int moves = 0;
            String winner = null;
            Boolean win = null;

            while (moves < 9 || !win) {
                if (turn == 1) {
                    System.out.println("Player 1 please mark the board:");
                    int spot = gameScanner.nextInt();
                    game.gameBoard[spot] = player1.icon;
                    game.printGameBoard(game.gameBoard);
                    moves++;
                    turn = 2;

                    if (game.checkWinX(game.gameBoard) == true) {
                        winner = player1.name;
                        win = true;
                        break;
                    }
                } else {
                    System.out.println("Player 2 please mark the board:");
                    int spot = gameScanner.nextInt();
                    game.gameBoard[spot] = player2.icon;
                    game.printGameBoard(game.gameBoard);
                    moves++;
                    turn = 1;
                    if (game.checkWinY(game.gameBoard) == true) {
                        winner = player2.name;
                        win = true;
                        break;
                    }
                }
            }
            System.out.println("The winner is: " + winner);
        }
    }
}
