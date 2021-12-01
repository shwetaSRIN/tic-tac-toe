package com.tictactoe.models;

public abstract class Player {
    public Symbol symbol;

    public abstract void makeMove(Board b);
}
