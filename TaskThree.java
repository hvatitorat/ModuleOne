package com.alevel.moduleOne;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println(getSquare(-2,-2,-1,3,4,1));
    }
    public static int getSquare(int x1, int y1, int x2, int y2, int x3, int y3){
        double AB = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double BC = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double AC = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        double p = (AB + BC + AC) / 2;
        double square = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));

        return (int) square;
    }
}
