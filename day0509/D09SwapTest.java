class D09SwapTest{
	public static void main(String[] args){
		int a = 3;
		int b = 7;

		System.out.println("두 변수의 초기값");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		int tmp;

		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("두 변수의 값을 서로 변경한 후");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
