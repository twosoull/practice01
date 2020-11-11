package com.javaex.pratice;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int num2 = num1*(10*12);
		
		System.out.println("월급을 입력하세요: "+num1);
		System.out.println("10년동안 최대 저축액은 "+num2+"원 입니다.");
		
		
		
	}

}
