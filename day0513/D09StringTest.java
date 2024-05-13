


class D09StringTest
{
	public static void main(String[] args) 
	{
		String data;
		data = "hellsdfsdfsdfdfdfoosdsdfsdfoosdfsdo";
		int cnt = 0;

		for (int i = 0; i < data.length(); i++)
		{
			if(data.charAt(i) == 'o')
				cnt++;
		}

		System.out.println(cnt);
	}
}
