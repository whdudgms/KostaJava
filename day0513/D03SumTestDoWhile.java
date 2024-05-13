// 사용자한테 N을 입력을 받아서 
import java.util.Scanner;
class  D03SumTest
{// 1개 이상의 class로 자바 어플리케이션이 구성된다.
	public static void main(String[] args) 
	{ // 자바 프로그램은 반드시 하나의 main메소드를 가져야 합니다.

		Scanner sc = new Scanner(System.in);
		//키보드로 부터 데이터를 입력받기 위하여 Scanner를 생성합니다.
				System.out.println("n을 입력해 주세요");
		int n = sc.nextInt();
		int sum3 = 0;
	

		// 무조건 한번은 실행되게 하기 위해서 Do While을 사용한다 
		int k = 1;
		do{
			sum3 += k;
			k++;
		}while(k <= n);


		System.out.println("결과");
		System.out.println(sum3);
	}
}
