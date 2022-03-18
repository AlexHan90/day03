package day03;

import java.util.Scanner;

public class Ex04 {

		public static void main(String[] args) {
			   Scanner input = new Scanner(System.in);
			   
			   int su;
			   System.out.print("수 입력 : ");
			   su = input.nextInt();
			   String s = (su % 2 == 0)?"짝수":"홀수";
			   System.out.println(su+" = "+s);

			   s = (su % 3 == 0)?"3의 배수":"3의 배수가 아니다";
			   System.out.println(su+" = "+s);
			   
			   System.out.print("두 수 입력 : ");
			   int num1 = input.nextInt();
			   int num2 = input.nextInt();
			   s = (num1 > num2)?"num1이 num2보다 크다":
			      "num2가 num1보다 크다";
			   System.out.println("num1 : "+num1+" ,num2 : "+num2);
			   System.out.println(s);
			}
		
		

	}


