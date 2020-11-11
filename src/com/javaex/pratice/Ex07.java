package com.javaex.pratice;

public class Ex07 {

	
	
	public static void main(String[] args) {
		int i = 10;
		int n = ++i %2;//1이 나오고 다른이유는 증가연산자가 변수의 앞으로 ++되어 식에 +1이 된채로 사용되었다 i++의 경우는 식에서는 사용이 안되고 다음 
						//이 변수를 빠져나온 이후에 작동된다
		System.out.println(i); //11
		System.out.println(n); //1
		
		
	}
}
