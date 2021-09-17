package week2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] str=test.split(" ");
		String temp;
		
		for (int i = 0; i < str.length; i++)
		{
			if(i%2!=0)
			{
				temp=str[i];
				char[] ch = temp.toCharArray();
				String rev="";
				for (int j = ch.length - 1; j >= 0; j--) {
					rev = rev + ch[j];
				}
				str[i]=rev;
			}
		}
			

		for (int j = 0; j < str.length; j++)
			System.out.print(str[j] + " ");
	}

}
