import java.util.Scanner;

class AgeCal 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		String age1,age2,age3;
		System.out.print("�ƺ� ���̸� �Է��� -->");
		age1 = sc.next();
		System.out.print("���� ���̸� �Է��� -->");
		age2 = sc.next();
		System.out.print("�Ƶ� ���̸� �Է��� -->");
		age3 = sc.next();
	

		System.out.println("��� : " + ((age1 +age2 +age3)/3));
	}
}
