// 증감연산자가 단독으로 쓰일 때는 
// 변수명 앞에 오거나 뒤에 오거나 결과는 같다.

class D29IncDec 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;

		a++;
		++b;

		System.out.println(a);
		System.out.println(b);
	}
}
