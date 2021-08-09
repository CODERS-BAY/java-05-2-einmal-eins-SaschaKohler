package com.sksoft;

public class Main {

    public static void main(String[] args) {
	// write your code here


        for(int i = 1 ; i <= 10; i++ ){
            System.out.println(i+"er Reihe:");
            for(int j = 1; j <= 10; j++){
                int prod = i * j;
                System.out.printf(" %d * %d = %d \n",i,j,prod);;
            }
        }
    }
}
