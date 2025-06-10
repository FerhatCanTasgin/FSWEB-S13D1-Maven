package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
       if(!isBarking) {
           return false;
       }
       if(clock >23 || clock < 0 ) {
           return false;
       }
       else if( clock >20 || clock < 8) {
           return true;
       }
       else {
           return false;
       }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       Integer[] dizi = {firstAge, secondAge, thirdAge};
       boolean control = false;
       for (int i = 0; i < dizi.length; i++) {
           if(dizi[i] >=13 && dizi[i] <=19){
               control = true;
               break;
           }
       }
        return control;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean control = false;
        if(isSummer) {
            if(temp <=45 && temp >= 25) {
                control = true;
         }
            else {
                control = false;
         }
     }
        else if(!isSummer) {
            if(temp <=35 && temp >=25) {
                control = true;
            }
            else {
                control = false;
            }
        }
        return control;
    }

    public static double area(double width, double height) {
       if(width <0 || height <0) {
           int i = -1;
           return i;
       }
       else {
           double alan = width * height;
           return alan;
       }
    }

    public static double area(double radius) {
       if(radius <0) {
           int i = -1;
           return i;
       }
       else {
           double alan = radius*radius*Math.PI;
           return alan;
       }
    }
}
