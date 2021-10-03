package com.epam.jwd35.lesson2;

import java.util.Random;

public class task08 {

    public static void main(String[] args) {
        int N = 15, K = 2;
        int sum = 0;
        int[] A = new int[N];
        Random rand = new Random();
        for(int i=0; i<A.length; i++)
        {
            A[i]=rand.nextInt(100)+1;
            if(A[i]%K==0)
            {
                sum+=A[i];
            }
        }
        System.out.println("Сумма: "+sum);
    }
}

