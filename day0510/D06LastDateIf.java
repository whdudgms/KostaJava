import java.util.Scanner;

class D06LastDateIf 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int month, lastDate = 31;
		System.out.print("월을 입력하시오 ->");
		month = sc.nextInt();

		if(month < 1 || month > 12){
			System.out.println("입력오류");
			return;
		}

		if(month == 1 || month ==3 || month == 5 || month == 7 
			|| month == 8 || month == 10 || month == 12){
			lastDate = 31;
		}else if(month == 4 || month == 6 || month == 9 || month == 11){
			lastDate = 30;
		}else if(month == 2){
			lastDate = 28;
		}
		System.out.printf("%d월은 %d일까지 있어요",month,lastDate);
	}
}
