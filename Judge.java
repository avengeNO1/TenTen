package com.Game;

public class Judge {//裁判实体类

    private int count;//游戏次数
    private int score;//得分
    private int hit;//击中
    private int miss;//未击中

    //构造方法

    public Judge() {
    }

    public Judge(int count, int score, int hit, int miss) {
        this.count = count;
        this.score = score;
        this.hit = hit;
        this.miss = miss;
    }

    //成员方法 判断是否打中
    public void check(Player player,Enemy enemy){
        if (player.getRow() == enemy.getRow() && player.getCol() == enemy.getCol()){
            System.out.println("恭喜您击中"+enemy.getName());
            score += enemy.getValue();//击中分数
            hit++;
        }else {
            System.out.println("====没有击中====");
            score -= 5;
            miss++;
        }
        count++;//游戏次数累计
    }

    @Override
    public String toString() {
        return "Judge{" +
                "count=" + count +
                ", score=" + score +
                ", hit=" + hit +
                ", miss=" + miss +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getMiss() {
        return miss;
    }

    public void setMiss(int miss) {
        this.miss = miss;
    }
}
