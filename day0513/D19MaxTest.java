class D19MaxTest {
	public static void main(String[] args){
	int[] data = {13, 10, 5, 25, 30, 12};
	int max = data[0]; 

	for(int i = 1; i < data.length; i++){
		if (data[i] > max){
			max = data[i];
		}
	}

	System.out.println(max +"는 가장 큰 수입니다.");
	}
}
