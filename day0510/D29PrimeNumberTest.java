import java.util.Scanner;

class D30PrimeNumberTest 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0)
				count++;
		}
		if(count==2)
			System.out.println("소수");
		else
			System.out.println("소수아님");
	}
}
