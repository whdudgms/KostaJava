import java.util.Scanner;

class D24MaxTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;

		System.out.print("수1을 입력하시오 -->");
		a = sc.nextInt();
		System.out.print("수2을 입력하시오 -->");
		b = sc.nextInt();
		System.out.print("수3을 입력하시오 -->");
		c = sc.nextInt();


		if(a > b){
			if(a > c){
				System.out.print("가장 큰 수는 >" +a);
			}else{
				System.out.print("가장 큰 수는 >" +c);
			}
		}else{
			if(b > c){
				System.out.print("가장 큰 수는 >" +b);
			}else{
				System.out.print("가장 큰 수는 >" +c);
			}
		}
	}
}
