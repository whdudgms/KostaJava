
import java.util.Scanner;

class Programing8
{
	public static void main(String[] args) 
	{
	Scanner sc  =  new Scanner(System.in);
	int height = sc.nextInt();
	double inch = 2.54;
	double fit = 2.54 * 12;

	double in;
	int fi;

	fi = (int)((double)height / fit);

	in = ((double)height % fit ) / inch;

	System.out.printf("%dcm는 %d피트 %f인치입니다."
		, height, fi, in);


	}
}
