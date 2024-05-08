import java.util.Scanner;

class D28Print1ToNMultiple3Sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 어디까지 출력 해 줄까");
		int to = sc.nextInt();
		boolean flag = true;
		int  n = 1;
		long sum = 0;
		
		while(flag){
			if(n % 3 == 0)
				sum += n;

			if(n == to){
				flag = false;
			}
			++n;
		}
		System.out.println(sum);
	}
}
