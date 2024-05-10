
import java.util.Scanner;

class D15ForTest{
	public static void main(String[] args){
		
		Scanner sc =  new Scanner(System.in);

		System.out.print("N을 입력해주세요! ==>");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			if(i % 2 == 1)
				System.out.println(i);
		}
	
	}
}
