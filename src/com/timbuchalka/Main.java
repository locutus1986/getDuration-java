package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	getDurationString(61);
    }

    public static void getDurationString(int min, int sec ){
        if(min < 0 || sec < 0 || sec > 59){
            System.out.println("invalid value");
        }

        int hours, mins, secs;

            hours = min/60;
            mins = min%60;
            secs = sec;

        System.out.println( hours +"h " + mins +"m " + secs + "s");
    }

    public static void getDurationString(int sec){
        if(sec < 0){
            System.out.println("invalid value");
        }

        int numMin = sec/60;
        int numSec = sec%60;

        getDurationString(numMin, numSec);

    }
}
