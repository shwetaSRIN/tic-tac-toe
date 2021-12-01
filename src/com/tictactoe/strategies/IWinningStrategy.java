package com.tictactoe.strategies;

import com.tictactoe.models.Board;
import com.tictactoe.models.Player;

import java.util.List;

public interface IWinningStrategy {
    int checkWinner(Board b, List<Player> players);
}
