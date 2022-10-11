package com.Game;

import java.util.Random;

public class Enemy {

    private int row;//横坐标
    private int col;//纵坐标
    private int value;//分数
    private char type;//形状
    private String name;//名字

    //构造方法

    public Enemy() {

    }

    public Enemy(int row, int col, int value, char type, String name) {
        this.row = row;
        this.col = col;
        this.value = value;
        this.type = type;
        this.name = name;
    }

    //成员方法
    //敌人出现
    public void appear(char[][] cave){

        Random random = new Random();

        this.setRow(random.nextInt(cave.length));
        this.setCol(random.nextInt(cave.length));

        cave[this.getRow()][this.getCol()] = this.getType();
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "row=" + row +
                ", col=" + col +
                ", value=" + value +
                ", type=" + type +
                ", name='" + name + '\'' +
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
