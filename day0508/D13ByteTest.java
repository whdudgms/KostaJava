// 오버플로우 용량이 넘쳐서 이상한 값이 나옴 
// 자료형이 표현할 수 있는 값이 원처럼 연결 됐다고 생각!.
// 최댓값 +1 -> 최솟값       횟수표시 줄넘기의 최솟값 -1 >> 최댓값!
class D13ByteTest{
	public static void main(String[] args){
		byte data;
		data = -128;
		data = (byte)(data-1);
		System.out.println(data);
	}
}
