import java.util.Scanner;
class  D04StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		String name,result = "불합격";
		int kor,eng,math,tot,avg;
		System.out.print("이름을 입력하세요 -->");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요 -->");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 -->");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 -->");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = tot/3;
		if(avg >= 60 && kor >= 40 && eng >=40 && math >= 40){
			result = "합격";
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t결과");
		System.out.println("------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%s\n",
			name,kor,eng,math,tot,avg,result);
	}
}
