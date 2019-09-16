package Time;

import java.util.Scanner;

public class Time {

    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public Time(int seconds){

        this.seconds = seconds;
    }

    public int allseconds()

    {
        return this.hours*3600 + this.minutes*60 + this.seconds;
    }

    public void GetTime(){

        System.out.println(this.hours + this.minutes + this.seconds);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите секунды ");
        int seconds = sc.nextInt();
        System.out.println("Введите минуты ");
        int minutes = sc.nextInt();
        System.out.println("Введите часы");
        int hours = sc.nextInt();
        Time fullTime = new Time(hours, minutes, seconds);
        System.out.println("Общее количество секунд = "  +  fullTime.allseconds());
    }
}
