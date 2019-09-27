package class1;

import java.util.Scanner;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;
    static int a;
    static int b;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

    }

    public int metod(){

        this.hours = a/3600;
        return this.hours;
    }
    public int metod1(){
        this.minutes = (a %3600)/60 ;
        return this.minutes;
    }
    public int metod2(){
        b = a%60;
        this.seconds = a%60;
        return this.seconds;
    }


    public Time(int seconds){

        this.seconds = seconds;
    }

    public int allSeconds()
    {
        a = this.hours*3600 + this.minutes*60 + this.seconds;
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
        Time fullTime = new Time(seconds, minutes, hours);
        System.out.println("Общее количество секунд = "  +  fullTime.allSeconds());
        System.out.println( "Нормальное число секунд =  " + fullTime.metod2());
        System.out.println( "Нормальное число минут =  " + fullTime.metod1());
        System.out.println( "Нормальное число часов =  " + fullTime.metod());

    }
}
