
import java.util.Scanner;
class D28FactorsTest{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("어떤 수를 입력하시오??");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(n % i == 0)
				System.out.println(i);
		}
	}
}
