import java.util.Scanner;

class D20IfTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 정수를 입력하세요 ->");
		int n = sc.nextInt();

		if(n >=0)
			System.out.println(n);
		else
			System.out.println(n * n);

	}
}
