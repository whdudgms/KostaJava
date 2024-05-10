import java.util.Scanner;

class D05SwitchTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 5;
		switch(n){
			case 0 :System.out.println("영");break;
			case 1 :System.out.println("일");break;
			case 2 :System.out.println("이");break;
			case 3 :
			case 4 :
			case 5 :
			case 6 :
			case 7 :
			case 8 :System.out.println("팔");break;
			case 9 :System.out.println("구");break;
			default:System.out.println("입력범위를 넘었습니다.");
		}
		System.out.println("작업종료");
	}
}
