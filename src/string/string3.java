package string;

import java.util.Scanner;

public class string3 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите строку");
        String stroka = scanner.nextLine ();
        System.out.println ("Введите слово");
        String slovo = scanner.nextLine ();
        boolean start = (stroka.startsWith(slovo) && stroka.endsWith(slovo));
        System.out.println (start);
    }
}
