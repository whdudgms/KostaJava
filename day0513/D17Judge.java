import java.util.Scanner;
import java.util.Arrays;

class D17Judge
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		int[] score1 = new int[10];
		int num1 =0,num2 =0;

		//정답 초기화 
		for(int i = 0; i < score.length; i++){
			score[i] = 1 + i % 4;
		}

		// 정답 제출 초기화 및 정답 여부 넘버링
		for(int i = 0; i < score1.length; i++){
			System.out.printf("%d번 답을 입력하세요 1~4 -->",i+1);
			score1[i] = sc.nextInt();

			if (score[i] == score1[i])
			{
				num1++;
			}else{
				num2++;
			}
		}
		
		//최종 출력 
		System.out.println("맞춘수:"+num1);
		System.out.println("틀린수:"+num2);
		System.out.println("성적 처리 결과 ");
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(score1));
	
	}
}