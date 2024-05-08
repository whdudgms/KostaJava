/*
학생의 이름, 국어, 영어, 수학을 입력받아 
총점과 평균을 각각 구하여 출력합니다. 
단, 평균은 소수점 1째자리 까지 출력합니다. 

*/
import java.util.Scanner;
class D20StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.println("이름을 입력해 주세요 -->");
		name = sc.next();
		System.out.println("국어점수를 입력해 주세요 -->");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력해 주세요 -->");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력해 주세요 -->");
		math = sc.nextInt();
		tot = kor+eng+math;
		avg = tot/3.0;
		System.out.printf("이름 :%s  평균 %.1f",name,avg);
	}
}
