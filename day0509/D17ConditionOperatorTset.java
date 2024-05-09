import java.util.Scanner;

class D17ConditionOperatorTset {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("수1를 입력해 주세요!");
		num1 = sc.nextInt();
		System.out.print("수2를 입력해 주세요!");
		num2 = sc.nextInt();

		System.out.println(num1 >= num2? num1: num2);
	}
}



/*
	
*/