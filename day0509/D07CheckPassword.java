import java.util.Scanner;
class D07CheckPassword {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("암호 입력하시오==>");
		String pw = sc.next();
		System.out.print("암호 확인입력하시오==>");
		String chkPwd = sc.next();

		if(pw.equals(chkPwd) && pw.length() >= 8){
			System.out.print("암호확인이 되었습니다.");
		}else{
			System.out.print("암호와 암호확인을 일치시키고, 8자 이상으로 작성 ㄱㄱ .");
		}
	}
}
