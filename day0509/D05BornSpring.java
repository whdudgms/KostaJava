import java.util.Scanner;

class D05BornSpring
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int month;
		System.out.print("출생 월을 입력해주세요 >>!");
		month = sc.nextInt();
		if(month < 1 || month > 12){
			System.out.println("월을 똑바로 입력하세요!");
			return;
		}

		if (3<=month&& month<=5)
		{
			System.out.print("봄");
		}else{
			System.out.print("봄 아님");
		}
	}
}
