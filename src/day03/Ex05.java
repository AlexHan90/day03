package day03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		
    System.out.print("수 입력: ");
  	int s = input.nextInt();
  	  	
  	String x = ((s%2 == 0) ? "짝수":"홀수");
  	System.out.println(x);
  	
  	String b = ((s%3 == 0) ? "3의 배수" : "3의 배수가 아니다");
  	System.out.println(b);
  	
  	
  	
  	
  	System.out.print("두 수 입력: ");
  	
  	int o = input.nextInt();
  	int o2 = input.nextInt();
  	
  	System.out.println(o);
  	System.out.println(o2);
  	
    String y = (o < o2 ? "o2가 o보다 크다" : "o가 o2보다 크다");
    System.out.println(y);
   
   
  	
  	
  	
  	
  	
  	
  
  
  
  
 







		/*System.out.print("수 입력받기: ");
		int number = input.nextInt();
		System.out.println(number);
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다");
		}
		
		else {
			System.out.println("홀수입니다");
		}
		
		System.out.println("3의 배수면 출력하시오");
		System.out.println("수 입력");
		
		int a = input.nextInt();
		
		if((a%3)==0){
			System.out.println("입력하신 수는 33의 배수가 맞습니다");
		}
		
		else
			System.out.println("입력하신 수는 3의 배수가 아닙니다");
		*/

		
		

	}

}
