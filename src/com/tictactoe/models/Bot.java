package com.tictactoe.models;

import com.tictactoe.strategies.IMoveStrategy;

import java.util.Random;
import java.util.Scanner;

public class Bot extends Player{
    IMoveStrategy moveStrategy;

    public static Builder getBuilder(){
        return new Builder();
    }

    @Override
    public void makeMove(Board b) {
        System.out.println("Make Bot Move :");
        Random random=new Random();
        int val=this.symbol==Symbol.O?-1:1;
        while(true){
            int i=random.nextInt(b.getRows());
            int j=random.nextInt(b.getColoums());
            if(b.getValue(i,j)==0){
                b.setValue(i,j,val);
                System.out.println("Bot coordinates :"+i+" "+j);
                return;
            }
        }

    }

    public static class Builder{
        private Bot bot;
        Builder(){
            bot = new Bot();
        }

        public Builder setSymbol(Symbol symbol){
            this.bot.symbol=symbol;
            return this;
        }
        public Builder setMoveStrategy(IMoveStrategy moveStrategy){
            this.bot.moveStrategy=moveStrategy;
            return this;
        }
        public Bot build(){
            return this.bot;
        }
    }

}
