package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	getDurationString(8000);
    }

    public static void getDurationString(int min, int sec ){
        if(min < 0 || sec < 0 || sec > 59){
            System.out.println("invalid value");
        }

        int hours, mins, secs;

        hours = min/60;
        mins = min%60;
        secs = sec;

        String hoursString = hours + "h ";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minsString = mins + "m ";
        if(mins < 10){
            minsString = "0" + minsString;
        }

        String secsString = secs + "s ";
        if(secs < 10){
            secsString = "0" + secsString;
        }

        System.out.println( hoursString + minsString + secsString );
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
