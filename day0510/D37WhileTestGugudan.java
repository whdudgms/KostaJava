
/*
	사용자한테 구구단 중에 몇단을 출력할지 물어봐서
	그 구구단을 출력하는 프로그램을 while문을 이용하여 작성 해 봅니다. 
*/
import java.util.Scanner;


class D37WhileTestGugudan 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("원하시는 단을 말씀하세요 >>");
		int dan  = sc.nextInt();
		int i = 1;
		while(i <= 9){
			System.out.printf("%d * %d = %d \n",dan,i,dan*i);
			i++;
		}
	}
}
