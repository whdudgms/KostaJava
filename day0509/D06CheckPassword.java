import java.util.Scanner;
class D06CheckPassword {
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("암호 입력하시오==>");
		String pw = sc.next();
		System.out.print("암호 확인입력하시오==>");
		String chkPwd = sc.next();
		if(pw.equals(chkPwd)){
			System.out.print("암호확인이 되었습니다.");
		}else{
			System.out.print("암호가 일치하지 않습니다.");
		}
	}
}
