package day03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	int number;
	System.out.println("수 입력 받기: ");
	
	number = input.nextInt();
	
	
	String s = (number%2 == 0) ? "짝수":"홀수";
	System.out.println(number + "=" + s);
	
	String b = (number%3 == 0) ? "3의배수다":"3의 배수가 아니다";
	System.out.println(number + "=" + b);
	
	System.out.println("두 수 입력: ");
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	
	System.out.println("num1: " + number2 + ",num2: " + number3);
	
	String x = (number2 < number3) ? "num2가 num1보다 크다": "numr1이 num2보다 크다";
	System.out.println(x);
		
	

	}

}
