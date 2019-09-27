package class2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    private int anInt1;
    private int anInt2;
    private double double1;
    private double double2;

    public BigDecimalClass(double double1, double double2){
        this.double1 = double1;
        this.double2 = double2;
    }
    public BigDecimalClass(int anInt1, int anInt2){
        this.anInt1 = anInt1;
        this.anInt2 = anInt2;
    }
    public double metodAdd ( double double1, double double2 ) {
        return (double1 + double2);
    }
    public int metodAdd ( int anInt1, int anInt2){
        return (anInt1 + anInt2);
    }
    public  double metodSub ( double double1, double double2 ){
        return (double1 - double2);
    }
    public  int metodSub ( int anInt1, int anInt2 ){
        return (anInt1 - anInt2);
    }
    public double multMetod ( double double1, double double2){
        return (double1*double2);
    }
    public int multMetod ( int anInt1, int anInt2){
        return (anInt1*anInt2);
    }
    public double divMetod (double double1, double double2){
        return (double1/double2);
    }
    public int divMetod (int anInt1, int anInt2){
        return (anInt1/anInt2);
    }
    public BigDecimal metodAdd (BigDecimal double1, BigDecimal double2){
        return double1.add(double2);
    }
    public BigDecimal metodSub (BigDecimal double1, BigDecimal double2){
        return double1.subtract(double2);
    }
    public BigDecimal multMetod(BigDecimal double1, BigDecimal double2){
        return double1.multiply(double2);
    }
    public BigDecimal divMetod(BigDecimal double1, BigDecimal double2){
        return double1.divide(double2, RoundingMode.HALF_UP);
    }

    public static void main ( String[] args ) {
        BigDecimalClass integer = new BigDecimalClass (1,5);
        BigDecimalClass doubleN = new BigDecimalClass (1.5,10.8);
        System.out.println("Для int: ");
        System.out.println(integer.metodAdd (integer.anInt1,integer.anInt2));
        System.out.println(integer.metodSub (integer.anInt1,integer.anInt2));
        System.out.println(integer.multMetod (integer.anInt1,integer.anInt2));
        System.out.println(integer.divMetod (integer.anInt1,integer.anInt2));
        System.out.println("Для double: ");
        System.out.println(doubleN.metodAdd (doubleN.double1,doubleN.double2));
        System.out.println(doubleN.metodSub (doubleN.double1,doubleN.double2));
        System.out.println(doubleN.multMetod (doubleN.double1,doubleN.double2));
        System.out.println(doubleN.divMetod (doubleN.double1,doubleN.double2));
        System.out.println("Для BidDecimal: ");
        System.out.println(doubleN.metodAdd (BigDecimal.valueOf(doubleN.double1),BigDecimal.valueOf(doubleN.double2)));
        System.out.println(doubleN.metodSub (BigDecimal.valueOf(doubleN.double1),BigDecimal.valueOf(doubleN.double2)));
        System.out.println(doubleN.multMetod (BigDecimal.valueOf(doubleN.double1),BigDecimal.valueOf(doubleN.double2)));
        System.out.println(doubleN.divMetod (BigDecimal.valueOf(doubleN.double1).setScale (1),BigDecimal.valueOf(doubleN.double2).setScale(1)));
    }
}
