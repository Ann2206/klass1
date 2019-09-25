package class1;

import java.util.Scanner;

public class Bankomat {
    private int numberMoney20;
    private int numberMoney50;
    private int numberMoney100;
    private int allMoney;
    private int summa;
    static int i = 0;
    static int j = 0;
    static int m = 0;
    static int a = 0;

    public int getAllMoney() {
        return allMoney;
    }


    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }


    public Bankomat(int numberMoney20, int numberMoney50, int numberMoney100, int allMoney, int summa) {
        this.numberMoney20 = numberMoney20;
        this.numberMoney50 = numberMoney50;
        this.numberMoney100 = numberMoney100;
        this.summa = summa;
        this.allMoney = this.numberMoney20 * 20 + this.numberMoney50 * 50 + this.numberMoney100 * 100;
    }


    public void addMoney(int numberMoney100, int numberMoney50, int numberMoney20, int add20, int add50, int add100) {
        this.numberMoney20 += add20 * 20;
        this.numberMoney50 += add50 * 50;
        this.numberMoney100 += add100 * 100;
    }


    private boolean getMoney (int summa, int allMoney) {
        if ( this.summa % 100 == 10 && (this.numberMoney20 < 3 || this.numberMoney50 < 1) ) {
            a = 1;
            return false;
        } else {
            if ( this.summa % 100 == 20 && this.numberMoney20 < 1 ) {
                a = 1;
                return false;
            } else {
                if ( this.summa % 100 == 30 && (this.numberMoney20 < 4 || this.numberMoney50 < 1) ) {
                    a = 1;
                    return false;
                } else {
                    if ( this.summa % 100 == 40 && this.numberMoney20 < 2 ) {
                        a = 1;
                        return false;
                    } else {
                        if ( this.summa % 100 == 50 && this.numberMoney50 < 1 ) {
                            a = 1;
                            return false;
                        } else {
                            if ( this.summa % 100 == 60 && this.numberMoney20 < 3 ) {
                                a = 1;
                                return false;
                            } else {
                                if ( this.summa % 100 == 70 && (this.numberMoney20 < 1 || this.numberMoney50 < 1) ) {
                                    a = 1;
                                    return false;
                                } else {
                                    if ( this.summa % 100 == 80 && this.numberMoney20 < 4 ) {
                                        a = 1;
                                        return false;
                                    } else {
                                        if ( this.summa % 100 == 90 && (this.numberMoney20 < 2 || this.numberMoney50 < 1) ) {
                                            a = 1;
                                            return false;
                                        } else {
                                            if ( this.summa <= this.allMoney && this.summa % 10 == 0 && this.summa != 10 && this.summa != 30 ) {
                                                this.allMoney = this.allMoney - this.summa;
                                                return true;
                                            } else {
                                                a = 1;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int returnMoney (int summa) {
        if ( a == 0 ) {
            if ( this.summa % 100 == 10 || this.summa % 100 == 30 ) {
                if ( this.numberMoney100 >= ( this.summa / 100 ) ) {
                    while ( this.summa / 100 != 1 ) {
                        this.summa -= 100;
                        i++;
                    }
                    this.summa -= 50;
                    m = 1;
                    while ( this.summa != 0 ) {
                        this.summa -= 20;
                        j++;
                    }
                } else {
                    if ( this.numberMoney50 >= ( this.summa / 50 ) ) {
                        while ( this.summa / 100 != 1 ) {
                            this.summa -= 50;
                            m++;
                        }
                        this.summa -= 50;
                        m += 1;
                        while ( this.summa != 0 ) {
                            this.summa -= 20;
                            j++;
                        }
                    } else {
                        if ( this.numberMoney20 >= ( this.summa / 20 ) ) {
                            while ( this.summa / 100 != 1 ) {
                                this.summa -= 20;
                                j++;
                            }
                            this.summa -= 50;
                            m = 1;
                            while ( this.summa != 0 ) {
                                this.summa -= 20;
                                j++;
                            }
                        }
                    }
                }
            } else {
                if ( this.summa % 20 != 0 ) {
                    if ( numberMoney100 >= ( this.summa / 100 ) ) {
                        while ( this.summa / 100 != 0 ) {
                            this.summa -= 100;
                            i++;
                        }
                        this.summa -= 50;
                        m = 1;
                        while ( this.summa == 0 ) {
                            this.summa -= 20;
                            j++;
                        }
                    } else {
                        if ( numberMoney50 >= ( this.summa / 50 ) ) {
                            while ( this.summa / 50 != 0 ) {
                                this.summa -= 50;
                                m++;
                            }
                            while ( this.summa != 0 ) {
                                this.summa -= 20;
                                j++;
                            }
                        } else {
                            while ( this.summa / 100 != 0 ) {
                                this.summa -= 20;
                                j++;
                            }
                            this.summa -= 50;
                            m = 1;
                            while ( this.summa != 0 ) {
                                this.summa -= 20;
                                j++;
                            }
                        }
                    }
                } else {
                        if ( this.numberMoney100 >= ( this.summa / 100 ) ) {
                            while ( this.summa >= 100 ) {
                                this.summa -= 100;
                                i++;
                            }
                            while ( this.summa != 0 ) {
                                this.summa -= 20;
                                j++;
                            }
                        } else {
                            if ( numberMoney50 >= ( this.summa / 50 ) ) {
                                while ( this.summa % 100 !=0 ) {
                                    this.summa -= 50;
                                    m++;
                                }
                                while ( this.summa != 0 ) {
                                    this.summa -= 20;
                                    j++;
                                }
                            } else {
                                if ( numberMoney20 >= ( this.summa / 20 ) ) {
                                    while ( this.summa != 0 ) {
                                        this.summa -= 20;
                                        j++;
                                    }
                                }
                            }
                        }
                    }
                }
        }else System.out.println ("Невозможно");
        return summa;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int buf = 0;
        System.out.println ("введите колво 20");
        int numberMoney20 = sc.nextInt ();
        System.out.println ("введите колво 50");
        int numberMoney50 = sc.nextInt ();
        System.out.println ("введите колво 100");
        int numberMoney100 = sc.nextInt ();
        System.out.println ("введите сумму");
        int summa = sc.nextInt ();
        Bankomat bankomat = new Bankomat (numberMoney20, numberMoney50, numberMoney100, buf, summa);
        System.out.println (bankomat.getMoney (summa, bankomat.allMoney));
        System.out.println (bankomat.returnMoney(summa));
        System.out.println (i + "*100 " + m + "*50 " + j + "*20 ");
        System.out.println (bankomat.allMoney);
    }
}