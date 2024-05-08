import java.util.Scanner;

class AgeCal 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		String age1,age2,age3;
		System.out.print("아빠 나이를 입력해 -->");
		age1 = sc.next();
		System.out.print("엄마 나이를 입력해 -->");
		age2 = sc.next();
		System.out.print("아들 나이를 입력해 -->");
		age3 = sc.next();
	

		System.out.println("평균 : " + ((age1 +age2 +age3)/3));
	}
}
