import java.util.Scanner;

class D30PrimeNumberTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 >");
		int n;
		n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i < n; i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}

		if(isPrime){
			System.out.println("소수입니다.");
		}else{
			System.out.println("소수가 아닙니다.");
		}
		
	}
}
