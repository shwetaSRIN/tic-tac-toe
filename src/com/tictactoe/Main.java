package com.tictactoe;

import com.tictactoe.Controller.GameController;
import com.tictactoe.factory.PlayerFactory;
import com.tictactoe.models.Game;
import com.tictactoe.models.Symbol;
import com.tictactoe.models.User;
import com.tictactoe.strategies.DefaultWinningStrategy;
import com.tictactoe.strategies.RandomMoveStrategy;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Game game= Game.getBuilder()
                .addPlayer(
                        PlayerFactory.createHumanPlayer()
                                .setUser(new User().setName("shweta"))
                                .setSymbol(Symbol.O)
                                .build()
                    )
               /* .addPlayer(
                        PlayerFactory.createHumanPlayer()
                                .setUser(new User())
                                .setSymbol(Symbol.X)
                                .build()
                )*/
                .addPlayer(
                        PlayerFactory.createBot()
                                .setMoveStrategy(new RandomMoveStrategy())
                                .setSymbol(Symbol.X)
                                .build()
                )
                .addWinningStrategy(new DefaultWinningStrategy())
                .setColums(3)
                .setRows(3)
                .build();
        GameController.run(game);

    }
}
