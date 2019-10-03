package string;
import java.lang.StringBuilder;
import java.lang.String;

public class string1 {
    public static void main(String[] args){
        long start = System.nanoTime ();
        for (int i=0; i<100000; i++ ){
            String s = "кругосветное";
            s+= " путешествие";
        }
long end = System.nanoTime ();
        System.out.println (end-start);

        long start1 = System.nanoTime ();
        for (int i = 0;i<100000; i++ ) {
        String s = "кругосветное";
        StringBuilder stringBuilder = new StringBuilder (s);
        stringBuilder.append(" путешествие");
        }
        long end1 = System.nanoTime ();
        System.out.println (end1-start1);
    }
}
