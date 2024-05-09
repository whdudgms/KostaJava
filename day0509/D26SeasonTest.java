/*
	사용자한테 월을 입력받아서 그 월이 몇일까지 있는지 출력하는 프로그램을 
	작성 해 봅니다. 
*/
import java.util.Scanner;

class D26SeasonTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 -->");
		int month = sc.nextInt();
		int result = 31;

		// 예외처리 
		if(month > 12 || 0 > month){
			System.out.print("끝");
			return;
		}
			

		if(4 == month || 6 == month || month == 9 || month == 11){
			result = 30; 
		}else if(month == 2){
			result = 28; 
		}
		System.out.printf("%d월은 %d일까지 있습니다.",month,result);
	}
}
