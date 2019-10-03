package string;

import java.util.Scanner;

public class string6 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите строку");
        String string = scanner.nextLine ();
        System.out.println (string.replaceAll ("(\\w)\\1+", "$1"));
        }
    }
