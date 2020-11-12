package com.javaex.pratice;

import java.util.Scanner;

public class Ex15 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("마일을 입력하세요:");
			int mile = sc.nextInt();
			double kilo = 1.609;
			double kilometer= (double)mile*kilo ;
			
			System.out.println(mile + "마일은 "+kilometer+"킬로미터 입니다.");
			
			
		}
}
