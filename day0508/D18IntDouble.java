class D18IntDouble{
	public static void main(String[] args){
	// 나누기 한 결과를 실수값을 담고 싶어요! 

	double div;
	//div = 5/2.0
	div  = 5/(double)2;
	System.out.println(div);
	
	}
}

/*
C:\javaTest\day0508>java D17IntDouble
2.0

--> 왜 결과가 2.5가 나오지 않고 2.0이 나오는가?
--> 5/2의 결과는 정수/정수를 했기 때문에 2입니다. 
--> 이것을 double형의 변수 div에 저장하여 결과가 2.0이 됩니다. 
--> 만약, 실수의 값 2.5가 나오기를 기대한다면 
--> 둘 중의 하나를 double형으로 변환합니다. 

div = 5/2.0;
div = 5/(double)2;
*/