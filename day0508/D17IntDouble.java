class D17IntDouble{
	public static void main(String[] args){
	
	double div;
	div  = 5/2;
	System.out.println(div);
	// 5/2 결과의 몫이 2여서 
	// 하나를 실수로 바꾸면 2.5로 나오게 할 수 있음.

	}
}

/*
C:\javaTest\day0508>java D17IntDouble
2.0

--> 왜 결과가 2.5가 나오지 않고 2.0이 나오는가?
--> 5/2의 결과는 정수/정수를 했기 때문에 2입니다. 
--> 이것을 double형의 변수 div에 저장하여 결과가 2.0이 됩니다. 
*/