import java.util.Scanner;

class D32Print1ToNMultiple3Sum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("3의 배수 누적합!");
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
			n = n + 1;
		}
		System.out.println(sum);
	}
}
