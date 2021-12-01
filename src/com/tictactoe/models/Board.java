package com.tictactoe.models;

public class Board {
    private int board[][];
    private int rows;
    private int coloums;
    Board(int rows,int cols){
        this.rows=rows;
        this.coloums=cols;
        board= new int[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getColoums() {
        return coloums;
    }

    void setValue(int i,int j,int val){
        board[i][j]=val;
    }
    void printBoard(){
        int r=board.length;
        int c=board[0].length;

        for(int i=0;i<r;i++){
            System.out.println();
            for(int j=0;j<c;j++){
                if(board[i][j]==1)
                    System.out.print(" "+'X');
                else if(board[i][j]==-1)
                    System.out.print(" "+'O');
                else
                    System.out.print(" "+'.');
            }
        }
        System.out.println();
    }

    public int getRowSum(int row) {
        int sum=0;
        for(int i=0;i<coloums;i++)
            sum+=board[row][i];
        return Math.abs(sum);
    }

    public int getColoumSum(int col) {
        int sum=0;
        for(int i=0;i<rows;i++)
            sum+=board[i][col];
        return Math.abs(sum);
    }
    public int getDiagnoalSum() {
        int sum=0;
        for(int i=0;i<rows;i++)
            sum+=board[i][i];
        return Math.abs(sum);
    }

    public int getAntiDiagnoalSum() {
        int sum=0;
        for(int i=0,j=rows-1;i<rows;i++,j--)
            sum+=board[i][j];
        return Math.abs(sum);
    }

    public int getValue(int i, int j) {
        return board[i][j];
    }
}
