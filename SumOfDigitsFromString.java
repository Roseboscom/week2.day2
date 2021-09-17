package week2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] ch = text.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				sum=sum+Character.getNumericValue(ch[i]);
			}

		}
		System.out.println("The total sum of the digit is: "+ sum);

	}

}







