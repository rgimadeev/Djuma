/**
 * Created by rgimadeev on 24.07.2017.
 */

import java.util.*;
class Muslim {

    public void sunna() {
        try {
            System.out.println("Имам и Муадзин: начинают читать 4 ракагата намаза сунны");
            System.out.println("Мусульмане: читают 4 ракагата намаза сунны");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fard() {
        try {
            Thread.sleep(3000);
            System.out.println("Имам и Муадзин: начинают читать 2 ракагата пятничного намаза фард");
            System.out.println("Мусульмане: начинают читать 2 ракагата пятничного намаза фард");
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sunna2() {
        try {
            System.out.println("Имам и Муадзин: начинают читать 2 ракагата намаза cунны");
            Thread.sleep(2000);
            System.out.println("Мусульмане: начинают читать 2 ракагата намаза cунны");
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tasbih() {
        try {
            System.out.println("Имам и Муадзин: начинают читать тасбих");
            Thread.sleep(3000);
            System.out.println("Мусульмане: начинают читать тасбих");
            Thread.sleep(9000);
            System.out.println("Мусульмане: проходят круг и дают салям имаму ,муадзину и другим мусульманам.Все уходят в ожидании следующей джумы. ");
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Imam extends Muslim{
    public Imam() {
        super();
    }
    public void vagaz() {
        try {
            System.out.println("Имам: встает и начинает рассказывать вагаз про ихсан");
            Thread.sleep(2000);
            System.out.println("Мусульмане: слушают вагаз от хазрата");
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hutba() {
        try {
            System.out.println("Имам: говорит худьбу на арабском");
            Thread.sleep(4000);
            System.out.println("Мусульмане: слушают худьбу на арабском языке не двигаясь");
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Muadsin extends Muslim{
    public Muadsin() {
        super();
    }
    public void azan() {
        try {
            System.out.println("Муадзин: говорит Азан");
            Thread.sleep(4000);
            System.out.println("Мусульмане: повторяют за муадзином слова азана");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void azan2() {
        try {
            System.out.println("Муадзин: говорит второй Азан");
            Thread.sleep(4000);
            System.out.println("Мусульмане: повторяют за муадзином слова второго азана");
            System.out.println("Имам: сидит на минбаре");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ikamat() {
        try {
            System.out.println("Муадзин: говорит икамат");
            Thread.sleep(4000);
            System.out.println("Мусульмане: повторяют за муадзином слова икамата, выстраиваются в ряды");
            Thread.sleep(2000);
            System.out.println("Имам: выходит вперед перед мусульманами, делает ният на прочтение 2 ракагатов пятничного намаза фард");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class DjumaTime {
    public  static void main(String[] args) {
        Imam it=new Imam();
        Muadsin mua=new Muadsin();
        for (int i = 1; i < 1000; i++) {
            System.out.println("--------Джума "+ i +" неделя---------");
            mua.azan();
            mua.sunna();
            mua.azan2();
            it.vagaz();
            it.hutba();
            mua.ikamat();
            mua.fard();
            mua.sunna2();
            mua.tasbih();
        }
    }
}




