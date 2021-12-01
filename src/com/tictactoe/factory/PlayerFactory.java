package com.tictactoe.factory;

import com.tictactoe.models.Bot;
import com.tictactoe.models.Human;

public class PlayerFactory {

    public static Human.Builder createHumanPlayer(){
        return  Human.getBuilder();
    }

    public static Bot.Builder createBot(){
        return  Bot.getBuilder();
    }
}
