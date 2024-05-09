import java.util.Scanner;

class D02TriangleTest{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		int width, height;
		double area;
		System.out.print("삼각형의 밑변-->");
		width = sc.nextInt();
		System.out.print("삼각형의 높이-->");
		height = sc.nextInt();
		area = (double)width * height / 2;
		System.out.printf("삼각형의 면적 :%.2f",area);
	}
}
