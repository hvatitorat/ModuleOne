package com.alevel.moduleOne;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Ход коня типа \'c3-->d5\'");
        String currentPos;
        String nextPos;
        String move = inputUser.next();
        while (!"x".equals(move)) {
            currentPos = move.split("-->")[0].toLowerCase();
            nextPos = move.split("-->")[1].toLowerCase();
            if (isRightMove(currentPos.charAt(0), Character.digit(currentPos.charAt(1), 10),
                    nextPos.charAt(0), Character.digit(nextPos.charAt(1), 10)))
                System.out.println("Ход возможен");
            else System.out.println("Ход невозможен");
            System.out.println("Ещё?");
            move = inputUser.next();
        }
    }
    public static boolean isRightPosition(char letter, int num) {
        return (letter < 'a' || letter > 'h') || (num < 1 || num > 8);
    }

    public static boolean isRightMove(char letCurrentPos, int numCurrentPos, char letNewPos, int numNewPos) {
        return (!isRightPosition(letCurrentPos, numCurrentPos) ||
                !isRightPosition(letNewPos, numNewPos)) &&
                Math.abs(letCurrentPos - letNewPos) + Math.abs(numCurrentPos - numNewPos) == 3;
    }
}
