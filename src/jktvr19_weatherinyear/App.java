/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19_weatherinyear;

import java.util.Random;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        // Создаем зубчатый массив для хранения дней года
        byte n = 0, min = 0, max = 0;
        String mon = "";
        Random random = new Random();
        int[][] degree = new int [12][];
        for (int i = 0; i < degree.length; i++){
            switch (i) {
                case 0: min = -25; max = 0; n = 31; mon = "January"; break;
                case 1: min = -20; max = 5; n = 29; mon = "February"; break;
                case 2: min = -10; max = 10; n = 31; mon = "March"; break;
                case 3: min = -5; max = 12; n = 30; mon = "April"; break;
                case 4: min = 0; max = 17; n = 31; mon = "May"; break;
                case 5: min = 5; max = 20; n = 30; mon = "June"; break;
                case 6: min = 10; max = 30; n = 31; mon = "July"; break;
                case 7: min = 10; max = 35; n = 31; mon = "August"; break;
                case 8: min = 9; max = 25; n = 30; mon = "September"; break;
                case 9: min = 0; max = 15; n = 31; mon = "October"; break;
                case 10: min = -10; max = 10; n = 30; mon = "November"; break;
                case 11: min = -20; max = 7; n = 31; mon = "December"; break;
            }
            degree[i] = new int [n];
            for (byte j = 0; j < degree[i].length; j++){
                degree[i][j] = random.nextInt(max - min +1) + min;
                System.out.print(degree[i][j]);
                System.out.println("  ");
            }
        }
        // Вывод температуры по месяцам
        System.out.println();
        System.out.print("           ");
        for (int i = 1; i<32; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i =1; i<35; i++){
            System.out.printf("%s","----");
        }
        System.out.println();
        
        for (byte i = 0; i < degree.length; i++){
            System.out.print(mon);
            System.out.printf("%2d|", i);
            for (byte j = 0; j< degree[i].length; j++){
                System.out.printf("%4d", i, degree[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        
    }
}
