package org.app;

//TWO PEEPS CAN ONLY BE IN LOVE WHEN EITHER OF THEIR FLOWERS ARE EVEN NUMBERED OR ODD, WRITE A PROG TO SHOW IF THEIR LOVE IS TRUE OR FALSE
public class Algorithms{
    public static void main(String[] args){
        final int flower1 = 4;
        final int flower2 = 3;
        if((flower1 % 2==0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
