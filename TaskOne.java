package com.alevel.moduleOne;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(getDiffElements(new int[]{1, 4, 5, 1, 1, 3, 6, 3, 11, 7, 8, 8, 4, 2}));
    }

    public static int getDiffElements(int[] mas) {
        int result = 0;
        int countUnique = 0;
        int count = 0   ;
        for (int i = 0; i < mas.length; i++) {
            countUnique++;
            for (int j = i + 1; j < mas.length; j++) {      //тут считается кол-во повторяющихся элементов
                if (mas[j] == mas[i]) {
                    count++;
                    break;
                }
            }
        }
        return result = countUnique - count; //от кол-ва всех элементов в массиве отнимается кол-во повторяющихся элементов


    }
}
