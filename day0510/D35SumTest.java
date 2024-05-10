import java.util.Scanner;
class  D35SumTest {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print(" >");
		int result = 0;
		for(int i = 1; i <= 30; i++){
			result += (i * i + 1);
		}
		System.out.println(result);
	}
}
