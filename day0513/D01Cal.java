// 사용자한테 N을 입력을 받아서 
import java.util.Scanner;
class  D01Cal
{// 1개 이상의 class로 자바 어플리케이션이 구성된다.
	public static void main(String[] args) 
	{ // 자바 프로그램은 반드시 하나의 main메소드를 가져야 합니다.

		Scanner sc = new Scanner(System.in);
		//키보드로 부터 데이터를 입력받기 위하여 Scanner를 생성합니다.
				System.out.println("n을 입력해 주세요");
		int n = sc.nextInt();
		int sum1 = 0 ,sum2 = 0,sum3 = 0;
		
		for(int i = 1; i <= n; i++){
			sum1 += i;
		}

		int j =1;
		while (j <= n)
		{
			sum2 += j;
			j++;
		}
			
		int k = 1;
		do{
			sum3 += k;
			k++;
		}while(k <= n);


		System.out.println("결과");
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
