import java.util.Scanner;
class D10SearchA 
{
	public static void main(String[] args) 
	{
		System.out.print("문자열을 입력하시오. -->");

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); 
		
		int result = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'A')
				result++;
		}

		System.out.println("A의 갯수는 ?   :"+result);
	}
}
