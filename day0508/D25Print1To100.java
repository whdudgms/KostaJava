import java.util.Scanner;

class D25Print1To100
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 어디까지 출력 해 줄까");
		int to = sc.nextInt();
		boolean flag = true;
		int  n = 1;
		
		while(flag){
				System.out.printf("%5d",n);
			if(n == to){
				flag = false;
			}
			n = n + 1;
		}

	}
}
