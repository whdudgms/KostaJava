
import  java.util.Scanner;

class D09StarTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String name;
		int month,day,lastDate = 31;

		System.out.print("이름을 입력해 주세요 -->");
		name = sc.next();		
		System.out.print("몇월에 태어났어요-->");
		month = sc.nextInt();


		if(month == 4 || month == 6 || month == 9 || month == 11){
			lastDate = 30;
		}else if(month == 2){
			lastDate = 28;
		}

		// 예외처리 생략 
		if(month <1 || month > 12){
			System.out.println("잘못된 월 입력!");
			return;
		}

		System.out.print("몇일에 태어났어요-->");
		day = sc.nextInt();
		if(day <1 || day > lastDate){
			System.out.println("잘못된 일 입력!");
			return;
		}

		switch(month){
			case 1:
				if(day >=1 && day <= 19)
					System.out.println("염소");
				else if(day >=20 && day <= 31)
					System.out.println("물병");
				break;
			case 2:
				if(day >=1 && day <= 18)
					System.out.println("물병");
				else if(day >=29 && day <= 28)
					System.out.println("물고기");
				break;
			case 3:
				if(day >=1 && day <= 20)
					System.out.println("물고기");
				else if(day >=21 && day <= 31)
					System.out.println("양자리");
				break;
			case 4:
				if(day >=1 && day <= 20)
					System.out.println("양자리");
				else if(day >=21 && day <= 30)
					System.out.println("황소자리");
				break;
			case 5:
				if(day >=1 && day <= 20)
					System.out.println("황소자리");
				else if(day >=21 && day <= 31)
					System.out.println("쌍둥이");
				break;
			case 6:
				if(day >=1 && day <= 20)
					System.out.println("쌍둥이");
				else if(day >=21 && day <= 30)
					System.out.println("게자리");
				break;
			case 7:
				if(day >=1 && day <= 22)
					System.out.println("게자리");
				else if(day >=23 && day <= 31)
					System.out.println("사자");
				break;
			case 8:
				if(day >=1 && day <= 22)
					System.out.println("사자");
				else if(day >=23 && day <= 31)
					System.out.println("처녀");
				break;
			case 9:
				if(day >=1 && day <= 22)
					System.out.println("처녀");
				else if(day >=23 && day <= 30)
					System.out.println("천칭");
				break;
			case 10:
				if(day >=1 && day <= 22)
					System.out.println("천칭");
				else if(day >=23 && day <= 31)
					System.out.println("전갈");
				break;
			case 11:
				if(day >=1 && day <= 21)
					System.out.println("전갈");
				else if(day >=22 && day <= 30)
					System.out.println("사수");
				break;
			case 12:
				if(day >=1 && day <= 21)
					System.out.println("사수");
				else if(day >=22 && day <= 31)
					System.out.println("염소");
				break;
		}
	}
}
