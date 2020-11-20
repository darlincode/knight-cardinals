package com.KnightsTour.test;

public class KnightsTour {
    private int[][] board = new int[8][8];
    private int currentRow, currentCol, counter = 2;

    public KnightsTour(){
        board[0][0] =1;
    }

    public void showBoard(){
        for(int row = 0; row<board.length; row++){
            for (int col = 0; col<board[row].length; col++){
                System.out.print(board[row][col]+ "  ");
            }
            System.out.println();
        }
    }

    public boolean moveKnight(int[] horizontal, int[] vertical, boolean next){
        if(next) {
            int counter = 10;
        }
        for(int moveNumber = 0; moveNumber<8; moveNumber++){

            currentCol = currentCol + horizontal[moveNumber];
            currentRow = currentRow + vertical[moveNumber];
            if(validate() && checkForNull()){
                board[currentRow][currentCol] = counter;
                counter++;
            }
            else{
                return false;
            }

//            System.out.println(currentCol+ " " +currentRow);
        }
        return false;
    }

    public boolean validate(){
        if((currentCol >=0 && currentCol<= 7)&& (currentRow >= 0 && currentRow <=7)){
            return true;
        }
        return false;
    }

    public boolean checkForNull(){
        if(board[currentRow][currentCol] == 0){
            return true;
        }
        return false;
    }
}
