

	import java.util.Scanner;                                         //Scaneer 문을 쓰기 위해 넣어줍니다.

	public class Calculator {            

	   public static void main(String[] args) {
	      System.out.println("첫번째 숫자를 입력하세요");                   //1번쨰 정수를 입력하라는 문장을 출력합니다.
	      Scanner input = new Scanner(System.in);                   //정수를 입력받기위해 Scaneer문을 써줍니다.
	      double num1 = input.nextInt();                            // /할떄 나머지를 표현하기위해 double을 사용해줍니다.
	      
	      System.out.println("두번째 숫자를 입력하세요");                  //2번쨰 정수를 입력하라는 문장을 출력합니다.
	      Scanner input1 = new Scanner(System.in);                 //input 또한 변수이기에 겹치면 안되서 뒤에 1을 붙여줍니다.            
	      double num2 = input1.nextInt();                          //역시 나머지를 위해 double을 사용해줍니다.
	      
	       Scanner input2 = new Scanner(System.in);                 //산술연산자를 입력받기위해 input2라는 변수를 사용해줍니다.
	      System.out.println("산술 연산자 중에서 하나를 선택하세요");        //산술연사자중 하나를 선택하세요라는 문장을 출력합니다.
	      String word = input2.next();                            //산술연사자는 문자이기 때문에 String을 활용하여 작성해줍니다.
	      
	      switch (word){                                          //산술연술자 종류가 4개이기 때문에 switch문을 활용해줍니다.
	      case "+":                                               //입력받은 연산자가 + 이면
	         System.out.println( num1 + num2 );                  //첫번쨰 정수와 두번째 정수를 더한 값을 출력합니다.
	         break;                                              //즉시 멈춥니다.
	      case "-":                                               //입력받은 연산자가 - 이면
	         System.out.println(num1- num2);                     //첫번째 정수와 두번째 정수를 뺀 값을 출력합니다.
	         break;                                              //즉시 멈춥니다.
	      case "*":                                               //입력받은 연산자가 * 이면
	         System.out.println(num1 * num2);                    //첫번째 정수와 두번째 정수를 곱한 값을 출력합니다.
	         break;                                              //즉시 멈춥니다.
	      case "/":                                               //입력받은 연산자가 / 이면
	         System.out.println(num1 / num2);                    //첫번째 정수와 두번쨰 정수를 나눈 값을 출력합니다.
	         break;                                              //즉시 멈춥니다.
	      
	   }

	 }
	}