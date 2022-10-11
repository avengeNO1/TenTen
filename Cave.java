package com.Game;

import java.util.Arrays;

public class Cave {//洞穴的实体类

    private char [][] holes;//地洞

    //构造方法
    public Cave() {

    }

    public Cave(char[][] holes) {
        this.holes = holes;
    }

    //成员方法
    //初始化地图
    public void initHoles(){
        holes = new char[5][5];
        for ( int i = 0;i < holes.length;i++){
            for ( int j = 0;j < holes[i].length;j++ ){
                holes[i][j] = 'O';
            }
        }
    }

    //展示地图
    public void showHoles(){
        for ( int i = 0;i < holes.length;i++){
            for ( int j = 0;j < holes[i].length;j++ ){
                System.out.print(holes[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Cave{" +
                "holes=" + Arrays.toString(holes) +
                '}';
    }

    //getter setter

    public char[][] getHoles() {
        return holes;
    }

    public void setHoles(char[][] holes) {
        this.holes = holes;
    }
}
