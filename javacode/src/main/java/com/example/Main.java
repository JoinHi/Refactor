package com.example;

/**
 * Created by zzj on 2017/5/9.
 */

public class Main {
    public static void main (String[] strings){
        Movie aGan = new Movie("阿甘正传",0);
        Movie yang = new Movie("喜洋洋",2);
        Movie yinhe = new Movie("银河护卫队2",1);
        Rental rental1 = new Rental(aGan,5);
        Rental rental2 = new Rental(yang,5);
        Rental rental3 = new Rental(yinhe,5);
        Customer zzj = new Customer("张中杰");
        zzj.addRental(rental1);
        zzj.addRental(rental2);
        zzj.addRental(rental3);
        System.out.println(zzj.statement());
    }
}
