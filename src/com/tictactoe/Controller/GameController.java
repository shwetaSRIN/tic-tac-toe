package com.tictactoe.Controller;

import com.tictactoe.models.Board;
import com.tictactoe.models.Game;
import com.tictactoe.models.Player;
import com.tictactoe.strategies.IWinningStrategy;

public class GameController {
    public static void run(Game game){
        game.printBoard();

        Board board=game.getBoard();
        int totalTurns=board.getRows()*board.getColoums();
        IWinningStrategy winningStrategy=game.getWinningStrategies().get(0);
        int turns=0;
        int playerID=0;
        while(turns<totalTurns){
            Player player= game.getPlayers().get(playerID);
            player.makeMove(board);
            int winner=winningStrategy.checkWinner(board,game.getPlayers());
            if(winner>0){
                game.printBoard();
                System.out.println("player "+playerID+" wins with Symbol"+player.symbol );
                return;
            }
            playerID^=1;
            turns++;

        }

        System.out.println("Match is a draw, No player wins!" );
    }
}
