package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public Main(String[] args, int[] d) {
	int[] myNum={4,6,1,8,3,7,9,0,10};

    int e;
    System.out.println("Input index");
        Scanner sc = new Scanner(System.in);
        e= sc.nextInt();
        d[0]=4;
    d[1]=6;
    d[2]=1;
    d[3]=8;
    d[4]=3;
    d[5]=7;
    d[6]=9;
    d[7]=0;
    d[8]=10;


    for(int i=0; i < myNum.length;i++)
        System.out.println(myNum[i]);
     if(e > myNum.length +1){
         System.out.println("Out of bounds");
         return;
     }
    else{
         System.out.println(Arrays.toString(d));
     }

    }
}
