package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str;
		System.out.print("1값 입력 : ");
		str = input.next();
		System.out.println(str);          
		
		System.out.print("2값 입력 : ");   //임시저장소의 값이 남아있는지 확인, 그래서 2번째입력할때 입력이불가
	    input.nextLine();
		str = input.nextLine();			 // next line  한번 더 사용, 위에   str 제거 
	
		
		System.out.println("출력 결과 : " + str);
		System.out.println("다음 문장들 실행!!!");
		
		

	}

}
