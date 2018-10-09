package com.company;

public class Main {

    // CONST
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(64,9));
    }

    public static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds <0 || seconds >59)){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = (minutes / 60);
        long reaminingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10)
            hoursString = "0" + hoursString;

        String minutesString = reaminingMinutes + "m";
        if (reaminingMinutes < 10)
            minutesString = "0" + minutesString;

        String secondsString = seconds + "s";
        if (seconds < 10)
            secondsString = "0" + secondsString;

        return hoursString +" "+ minutesString +" "+ minutesString;
    }

    public static String getDurationString(long seconds) {
        if (seconds <0 ) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = (seconds / 60);
        long reaminingSeconds = seconds % 60;

        return getDurationString(minutes,reaminingSeconds);
    }
}
