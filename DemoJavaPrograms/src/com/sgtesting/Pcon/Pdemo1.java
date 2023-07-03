package com.sgtesting.Pcon;
class Test {

    int i, p = 1;

   

    Test(int n) {
       
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                p = 0;
                break;
            }
        }

        if (p == 1) 
        {
            System.out.println(n+" is a prime number" );
        } 
        else
        {
            System.out.println(n+" is not a prime number" );
        }

    }
       
    }

   

public class Pdemo1 {

    public static void main(String args[]) {

        Test obj = new Test(531);

    }
}
