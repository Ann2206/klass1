package string;

import java.util.Scanner;

public class string5 {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите строку");
        String string = scanner.nextLine ();
        char[] s = string.toCharArray ();
        int count = 0;
        if ( s[string.length () - 1] == ' ' ) {
            count = 1;
            for (int i = 0; i < string.length () - 1; i++) {
                if ( s[i] == ' ' && s[i + 1] != ' ' ) {
                    count++;
                }
            }
        } else {
            if ( s[string.length () - 1] != ' ' ) {
                for (int i = 0; i < string.length (); i++) {
                    if ( s[i] == ' ' && s[i + 1] != ' ' ) {
                        count++;
                    }
                }
                count += 1;
            }
        }
        if ( s[0] == ' ' ) {
            count-=1;
        }
            System.out.println (count);
    }
}