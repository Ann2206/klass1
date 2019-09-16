package Bancomat;

import java.util.Scanner;

public class Bankomat {
    private int numbermoney20;
    private int numbermoney50;
    private int numbermoney100;
    private int allMoney;

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public Bankomat(int numbermoney20, int numbermoney50, int numbermoney100, int allMoney) {
        this.numbermoney20 = numbermoney20;
        this.numbermoney50 = numbermoney50;
        this.numbermoney100 = numbermoney100;
        this.allMoney = this.numbermoney20 * 20 + this.numbermoney50 * 50 + this.numbermoney100 * 100;
    }


    public void addMoney( int numbermoney100, int numbermoney50, int numbermoney20, int add20, int add50, int add100) {
        this.numbermoney20 += add20 *20;
        this.numbermoney50 += add50*50;
        this.numbermoney100 += add100*100;
    }


    public boolean getMoney(int summa, int allMoney) {
        if ( summa < this.allMoney && summa % 10 == 0 && summa != 10 && summa != 30) {
                this.allMoney = this.allMoney - summa;
                return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buf=0;
        System.out.println("введите колво 20");
        int numbermoney20 = sc.nextInt();
        System.out.println("введите колво 50");
        int numbermoney50 = sc.nextInt();
        System.out.println("введите колво 100");
        int numbermoney100 = sc.nextInt();
        System.out.println("введите сумму");
        int summa = sc.nextInt();
        Bankomat bankomat = new Bankomat( numbermoney20, numbermoney50, numbermoney100, buf);
        System.out.println(bankomat.getMoney(summa, bankomat.allMoney));
        System.out.println(bankomat.allMoney);
    }
}