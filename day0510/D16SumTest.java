import java.util.Scanner;

class D16SumTest{
	public static void main(String[] args){
		int num1=0,num2=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력해 주세요!");
		int n = sc.nextInt();

		for(int  i = 1; i <= n; i++){
			if(i % 2 == 0){
				num1 += i;
			}else{
				num2 += i;
			}
		}

		System.out.println(num1);
		System.out.println(num2);
	}
}
