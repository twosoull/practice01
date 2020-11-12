package com.javaex.pratice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("상품가격:");
		int price = sc.nextInt();
		System.out.print("받은돈:");
		int money = sc.nextInt();
		double tax = (double)price*0.1;
		
		System.out.println("============================");
		System.out.println("받은돈: "+money);
		System.out.println("상품가격: "+price);
		System.out.println("부가세: "+tax);
		System.out.println("잔액: "+(money-price));
		
		
		
	}
}
