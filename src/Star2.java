import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
	System.out.println("�������� �Ƕ�̵带 ����ǰǰ���?");
	Scanner input = new Scanner(System.in);
	int floor = input.nextInt();
	
	for(i=0; i<floor; i++)
	{
		for(j=i; j<floor - 1; j++)
		{
			System.out.print(" ");
		}
			for(k=0; k<i*2+1; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");	
		}
		
	

}

}
