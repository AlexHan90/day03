package day03;

public class Ex02 {

	public static void main(String[] args) {
		
	/*
	 사칙연산자
	 + , - , * , / , %
	 
	 / : 정수 / 정수 = 정수
	   	실수 결과를 원한다면 연산값들 중 하나라도 실수값 있어야 함
	   	
	 %(mod) : 정수 % 정수 = 나머지 값
	 		  
	 */
		
	// int num1 = 10, num2 = 3;
	// System.out.println(num1 / num2);
	// System.out.println(num1 / (float)num2);
	// System.out.println(num1 % num2);
	
	/*
	  a = 10;
	  a += 10; > a = a+10
	  a *= 10; > a = a*10
	  
	 */
		
	 int su1 = 5, su2 =5;
	su1+=1;
	System.out.println(su1);	// 5 = 5+1 = 6
	
	su1-=1;
	System.out.println(su1);	// 6 = 6-1 = 5
	
	su1*=su2;
	System.out.println(su1);    // 5 = 5*5 = 25
	
	su1/=su2;
	System.out.println(su1);	// 25 = 25/5 = 5
	
	su1%=su2;
	System.out.println(su1);	// 5 = 5%5 = 0 
	
	/*
	 관계연산자
	 <, >, <=, >=, ==
	 결과적으로 참(True) 또는 거짓(false) 표현
	 
	 10 < 20 => true, 10 > 20 => false 표현
	 
	 */
	
	 /*double do01 = 3.0, do02 = 3.2;
	 
	 System.out.println(do01 >= do02 );
	 System.out.println(do01 <= do02 );
	 System.out.println(do01 == do02 );
	 System.out.println(do01 != do02 );
	 
	 /* 
	  논리 연산자
	  - 참 또는 거짓을 표현
	  - 앞에있는 값과 뒤에있는 값을 연산( 값 || 값 =>)
	  
	 ||(or) : 값들 중 하나라도 참이면 결과는 참(true)
	 &&(and) : 값들 중 하나라도 거짓이면 결과는 거짓(false)
	 !(반전) : !참 => 거짓으로 변경, !거짓 => 참(true) 
	  
	  */
		
	System.out.println(false || false);
	System.out.println(false || true);
	System.out.println(true  || false);
	System.out.println(true  || true);
	
	System.out.println(false && false);
	System.out.println(false && true);
	System.out.println(true  && false);
	System.out.println(true  && true);
	
	System.out.println("!true : " + !true);
	
	// % : 범위 구할떄 또는 짝, 홀, 배수 
	
	su1 = 10;
	// boolean : 참또는 거짓만 저장 가능하다
	boolean bool;
	int result = su1 % 2;
	System.out.println("result : " + result);
	bool = result == 0;
	System.out.println("true면 짝수: " + bool);
	System.out.println("true면 홀수: " + bool);
	
	System.out.println(su1%2 == 0);
	System.out.println((su1%2 == 0) &&(su1>5));
	
	su1 = 9;
	System.out.println((su1%2 == 0) ||(su1>5));
	
	/*
	 증감 연산자
	 - 자기 자신을 1증가 또는 감소 시킨다
	 a = 10
	 a++, ++a, --a, a--
	 */
	
	su1 =10;
	su2 = ++su1; // 시작하자마자 +1 추가후 연산
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);
	
	su1 =10;
	su2 = su1++;  //연산 끝나고 +1
	System.out.println("su1 : " + su1);
	System.out.println("su2 : " + su2);
	
	su1 = 8;
	String s = (su1%2 ==0)?"짝수":"홀수";
	System.out.println( s );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
