import java.util.Scanner;
import java.util.Date;

class D11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		int age,chool;
		System.out.print("출생년도를 입력해주세요! -->");
		chool = sc.nextInt();
		age = (date.getYear()+1900) - chool; 
		
		if(age >= 40 && chool % 2 ==0){
			System.out.println("해당자");
			
		}else{
			System.out.println("해당자 아님");
		}

		if(age >= 40 & chool % 2 ==0){
			System.out.println("해당자");
		}else{
			System.out.println("해당자 아님");
		}
	
	}
}
