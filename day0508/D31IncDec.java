

class D31IncDec 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;
		
		// 아래 두 개의 연산결과는 같지만 
		// a는 값이 변함!
		// b는 값이 그대로임!
		System.out.println(++a);
		System.out.println(b+1);


		System.out.println(a); //6
		System.out.println(b); //5
	}
}
