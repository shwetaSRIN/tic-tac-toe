package com.tictactoe.models;

import com.tictactoe.exceptions.InValidPlayersQuantityException;
import com.tictactoe.strategies.IWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private ArrayList<Player> players= new ArrayList<>() ;
    private List<IWinningStrategy> winningStrategies = new ArrayList<>();

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void printBoard(){
        board.printBoard();
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public List<IWinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<IWinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }


    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private Game game;
        int rows,colums;
        Builder(){
            this.game= new Game();
        }

        public Builder addPlayer(Player player){
            game.getPlayers().add(player);
            return this;
        }
        public Builder setRows(int rows) {
            this.rows = rows;
            return this;
        }

        public Builder setColums(int colums) {
            this.colums = colums;
            return this;
        }

        public Builder addWinningStrategy(IWinningStrategy winningStrategy ) {
            game.getWinningStrategies().add(winningStrategy);
            return this;
        }
        public Game build(){
            //validation
            if(game.getPlayers().size()<2)
                throw new InValidPlayersQuantityException();
            Board board= new Board(rows,colums);
            game.setBoard(board);
            return game;
        }

    }
}
