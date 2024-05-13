import java.util.Scanner;

class D14ArrayTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int total =0,avg;
		for(int i = 0; i < score.length; i++){
			System.out.print("정수를 입력하세요 ==>");
			score[i] = sc.nextInt();
			total += score[i];
		}
		avg  = total/score.length;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
}