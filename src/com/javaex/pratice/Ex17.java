package com.javaex.pratice;

import java.util.Scanner;

public class Ex17 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("반지름: ");
	int r = sc.nextInt();
	double pie = 3.14;
	double v = ((pie)*(double)(r*r*r)*4)/3;
	
	System.out.println("구의부피는:" + v);
	
}
}
