package string;

import java.util.Scanner;

public class string4 {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите фамилию");
        String name = scanner.nextLine ();
        System.out.println ("Введите имя");
        String surname = scanner.nextLine ();
        System.out.println ("Введите отчество");
        String fathers = scanner.nextLine ();

        char a = (name.toUpperCase ()).charAt (0);
        char b = (surname.toUpperCase ()).charAt (0);
        char c = (fathers.toUpperCase ()).charAt (0);
        System.out.print (a);
        System.out.print (b);
        System.out.print (c);
    }
}
