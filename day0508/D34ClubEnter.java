// 사용자한테 키를 입력받아서 키가 170이하 이면 "입장 가능"
import java.util.Scanner;
class D34ClubEnter 
{
	public static void main(String[] args) 
	{
		System.out.print("키를 입력해 주세요!");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		boolean bo = 170 >= height;
	
		if(bo){
			System.out.print("170 이하임 입장 ㄱ");
		}else{
			System.out.print("170 초과임 입장ㄴㄴ");
		}
	}
}
