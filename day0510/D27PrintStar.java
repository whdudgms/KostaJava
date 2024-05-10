/*
	다음과 같이 동작하는 프로그램을 작성 ㄱㄱ 

	별 출력 
*/
import java.util.Scanner;


class D27PrintStar{
	public static void main(String[] args){

		Scanner sc =  new Scanner(System.in);
		System.out.print("별을 몇줄 출력할까요??");
		int n = sc.nextInt();
		System.out.print("별을 몇칸 출력할까요??");
		int n1 = sc.nextInt();
		for(int i=0;i < n; i++){
			for(int j=0;j < n1; j++){
				System.out.print("*");
		}
			System.out.println();
		}		
	}
}
