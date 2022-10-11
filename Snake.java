package com.Game;

import java.util.Random;

public class Snake extends Enemy {
    public void appear(char[][] cave){
        Random random = new Random();

        //  row = random.nextInt(5);//两种写法
        this.setRow(random.nextInt(cave.length));

        //col = random.nextInt(5);
        this.setCol(random.nextInt(2));
        //把地洞对应的row 和col的位置改为S
        // cave [row][col] = 'S';
        cave[this.getRow()][this.getCol()] = this.getType();
    }
}
