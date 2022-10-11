package com.Game;

import java.util.Scanner;

public class Player {

    private int row;
    private int col;

    //构造方法
    public Player() {

    }

    public Player(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //成员方法 玩家击打方法
    public void hit(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行和列 88 -- 退出   99 -- 重新开始");
        row =  sc.nextInt()-1;
        if (row == 87 || row  == 98 ){
            return;
        }
        col = sc.nextInt()-1;
    }


    @Override
    public String toString() {
        return "Player{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}


