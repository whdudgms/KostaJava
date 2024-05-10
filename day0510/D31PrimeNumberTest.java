import java.util.Scanner;

class D31PrimeNumberTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하세요  >");
		n = sc.nextInt();

		int i = 2;
		for(i = 2; i  < n; i++){
			if(n % i == 0){
				break;
			}
		}

		if(i == n){
			System.out.println("소수입니다.");
		}else{
			System.out.println("소수가 아닙니다.");
		}

	}
}
