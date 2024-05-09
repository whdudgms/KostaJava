import java.util.Scanner;

class D27DigitToKor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 99까지의 수를 입력하시오");
		int num = sc.nextInt();
		
		int sib = num / 10;
		int il = num % 10;

		if(num == 0){
			System.out.println("영");
			return;
		}
		
		String result = "";
		
		if(sib == 1){
			result += "십";
		}else if( sib == 2){
			result += "이십";
		}else if( sib == 3){
			result += "삼십";
		}else if( sib == 4){
			result += "사십";
		}else if( sib == 5){
			result += "오십";
		}else if( sib == 6){
			result += "육십";
		}else if( sib == 7){
			result += "칠십";
		}else if( sib == 8){
			result += "팔십";
		}else if( sib == 9){
			result += "구십";
		}


		if(il == 1){
			result += "일";
		}else if( il == 2){
			result += "이";
		}else if( il == 3){
			result += "삼";
		}else if( il == 4){
			result += "사";
		}else if( il == 5){
			result += "오";
		}else if( il == 6){
			result += "육";
		}else if( il == 7){
			result += "칠";
		}else if( il == 8){
			result += "팔";
		}else if( il == 9){
			result += "구";
		}

		System.out.println(result);
	}
}
