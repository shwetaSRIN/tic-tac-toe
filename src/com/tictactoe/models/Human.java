package com.tictactoe.models;

import java.util.Scanner;

public class Human extends Player{
    User user;

    public Symbol getSymbol(){
        return this.symbol;
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    @Override
    public void makeMove(Board b) {
        System.out.println("Player "+user.getName()+" Make Move enter coordinates:");
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int val=this.symbol==Symbol.O?-1:1;
        b.setValue(i,j,val);

    }

    public static class Builder{
        private Human humanPlayer;
        Builder(){
            this.humanPlayer= new Human();
        }
        public Builder setSymbol(Symbol symbol){
            this.humanPlayer.symbol=symbol;
            return this;
        }

        public Builder setUser(User user){
            this.humanPlayer.user=user;
            return this;
        }

        public Human build(){
            return this.humanPlayer;
        }
    }
}
