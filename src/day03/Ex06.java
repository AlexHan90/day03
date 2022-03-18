package day03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if(num > 10)
			System.out.println("num 10보다 크다");
		System.out.println("다음문장실행");
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println("입력 값 짝수: " + num);
		}
		if(num % 2 != 0) {
			System.out.println("입력 값 홀수: " + num);
		}
		System.out.println("다음 문장들 실행!!!");
		
		
	}
}
		
		/*
		System.out.println("1. 쉬운게임");
		System.out.println("2. 어려운게임");
		System.out.println("3. 종료");
		System.out.println(">>> : ");
		
		
		num = input.nextInt();
		if(num == 1) {
			System.out.println("쉬운게임 시작");
			
		}
		if(num == 2) {
			System.out.println("어려운게임 시작");
			
		}
		if(num == 3) {
			System.out.println("게임 종료");
		}
		System.out.println("다음 문장들 실행");
		*/
		
		
		
		
		
		/*
		 제어문
		 - 프로그램의 흐름을 변경할 수 있다.
		 - if , switch , for , while , do while , break , continue
		 
		 if 형식
		  - if (조건식){
		  	   (종속문장)
		  	해당 조건이 참이면 중괄호 내용이 실행
		  	
		  	}
		  	if문 종료후 다음 문장들 실행
		  	
		 */
		
		
		
		
		

	

