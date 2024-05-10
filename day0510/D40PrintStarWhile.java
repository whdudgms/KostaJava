import java.util.Scanner;
class D40PrintStarWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;

		System.out.println("몇 줄 ?");
		num1 = sc.nextInt();
		System.out.println("몇 줄 ?");
		num2 = sc.nextInt();
		num3 = num2;
		
		while(num1 > 0){
			 while(num2 >0){
				System.out.print("*");
				num2--;
			}
			System.out.println();
			num2 = num3;
			num1--;
		}

	}
}
