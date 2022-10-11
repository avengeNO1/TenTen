package com.Game;

import java.util.Random;

public class Game {
    public void run(){
        //成员初始化
        Enemy enemy = new Enemy();
        enemy.setName("敌人");

        Mouse mouse = new Mouse();
        mouse.setName("米奇");
        mouse.setType('M');
        mouse.setValue(10);

        Snake snake = new Snake();
        snake.setName("饭匙蛇");
        snake.setType('S');
        snake.setValue(20);

        Wolf wolf = new Wolf();
        wolf.setName("狼王");
        wolf.setType('W');
        wolf.setValue(30);

        Player player = new Player();
        Judge judge = new Judge();

        Enemy [] enemies ={mouse,wolf,snake};

        Random random = new Random();

        //欢迎语
        welcome();
        //地图构建
        Cave cave = new Cave();

        System.out.println("地图初始化");

        cave.initHoles();
        cave.showHoles();

        while (judge.getCount() < 5){


            //出现敌人
            int index = random.nextInt(enemies.length);
            enemies[index].appear(cave.getHoles());

            System.out.println("================");
            System.out.println(enemies[index].getName()+"出现");
            System.out.println("================");
            cave.showHoles();

            //玩家击打
            player.hit();
            if (player.getRow() == 87){
                System.out.println("退出游戏");
                break;
            }else if (player.getRow() == 98){
                System.out.println("重新开始游戏");
                //得分还原
                judge = new Judge();
                //地图还原
                cave.getHoles()[enemies[index].getRow()][enemies[index].getCol()] = '0';
                continue;
            }

            //判断是否击中
            judge.check(player,enemies[index]);
            System.out.println("当前得分："+judge.getScore());
            //地图还原
            cave.getHoles()[enemies[index].getRow()][enemies[index].getCol()] = '0';

        }
        System.out.println("GameOver");
        System.out.println("击打次数"+judge.getCount());
        System.out.println("击中"+judge.getHit());
        System.out.println("未击中"+judge.getMiss());
        System.out.println("最终得分"+judge.getScore());
    }
    public void welcome(){
        System.out.println("===============");
        System.out.println("欢迎进入游戏");
        System.out.println("===============");

    }
}
