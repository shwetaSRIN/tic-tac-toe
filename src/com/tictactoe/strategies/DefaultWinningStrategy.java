package com.tictactoe.strategies;

import com.tictactoe.models.Board;
import com.tictactoe.models.Player;

import java.util.List;

public class DefaultWinningStrategy implements IWinningStrategy{
    @Override
    public int checkWinner(Board b, List<Player> players) {
      //  for(Player p:players){
            int sum=0;
            int validsum=b.getRows();
            for(int i=0;i<b.getRows();i++){
                if(b.getRowSum(i)==validsum)
                    return 1;
            }
            for(int i=0;i<b.getColoums();i++){
                if(b.getColoumSum(i)==validsum)
                    return 1;
            }
            if(b.getDiagnoalSum()==validsum)
                return 1;
            if(b.getAntiDiagnoalSum()==validsum)
                return 1;

       // }
        return -1;
    }
}
