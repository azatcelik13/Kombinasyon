package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       int n,r,total=1,total1=1;
        int total2 = 1;
        Scanner inp =new Scanner(System.in);
        System.out.println("Küme eleman sayısını giriniz=");
        n =inp.nextInt();
        System.out.println("Kaç elemanlı kombinasyon hesaplansın");
        r=inp.nextInt();
        for (int a=1;a<=n;a++) {
            total = total * a;
        }
        for (int b=1;b<=r;b++){

            total1=total1*b;
        }
        for (int c=1;c<=(n-r);c++) {
            total2 = total2 * c;
        }

        System.out.println(n+  r+" Kombinasyon=C(n/r) " +(total/(total1*(total2))));

    }
}
