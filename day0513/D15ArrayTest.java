import java.util.Scanner;

class D15ArrayTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		int total =0,avg;
		for(int i = 0; i < score.length; i++){
			System.out.printf("%d번째 학생의 점수를 입력하세요 -->",i+1);
			score[i] = sc.nextInt();
			total += score[i];
		}
		avg  = total/score.length;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
}