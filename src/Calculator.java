

	import java.util.Scanner;                                         //Scaneer ���� ���� ���� �־��ݴϴ�.

	public class Calculator {            

	   public static void main(String[] args) {
	      System.out.println("ù��° ���ڸ� �Է��ϼ���");                   //1���� ������ �Է��϶�� ������ ����մϴ�.
	      Scanner input = new Scanner(System.in);                   //������ �Է¹ޱ����� Scaneer���� ���ݴϴ�.
	      double num1 = input.nextInt();                            // /�ҋ� �������� ǥ���ϱ����� double�� ������ݴϴ�.
	      
	      System.out.println("�ι�° ���ڸ� �Է��ϼ���");                  //2���� ������ �Է��϶�� ������ ����մϴ�.
	      Scanner input1 = new Scanner(System.in);                 //input ���� �����̱⿡ ��ġ�� �ȵǼ� �ڿ� 1�� �ٿ��ݴϴ�.            
	      double num2 = input1.nextInt();                          //���� �������� ���� double�� ������ݴϴ�.
	      
	       Scanner input2 = new Scanner(System.in);                 //��������ڸ� �Է¹ޱ����� input2��� ������ ������ݴϴ�.
	      System.out.println("��� ������ �߿��� �ϳ��� �����ϼ���");        //����������� �ϳ��� �����ϼ����� ������ ����մϴ�.
	      String word = input2.next();                            //��������ڴ� �����̱� ������ String�� Ȱ���Ͽ� �ۼ����ݴϴ�.
	      
	      switch (word){                                          //��������� ������ 4���̱� ������ switch���� Ȱ�����ݴϴ�.
	      case "+":                                               //�Է¹��� �����ڰ� + �̸�
	         System.out.println( num1 + num2 );                  //ù���� ������ �ι�° ������ ���� ���� ����մϴ�.
	         break;                                              //��� ����ϴ�.
	      case "-":                                               //�Է¹��� �����ڰ� - �̸�
	         System.out.println(num1- num2);                     //ù��° ������ �ι�° ������ �� ���� ����մϴ�.
	         break;                                              //��� ����ϴ�.
	      case "*":                                               //�Է¹��� �����ڰ� * �̸�
	         System.out.println(num1 * num2);                    //ù��° ������ �ι�° ������ ���� ���� ����մϴ�.
	         break;                                              //��� ����ϴ�.
	      case "/":                                               //�Է¹��� �����ڰ� / �̸�
	         System.out.println(num1 / num2);                    //ù��° ������ �ι��� ������ ���� ���� ����մϴ�.
	         break;                                              //��� ����ϴ�.
	      
	   }

	 }
	}