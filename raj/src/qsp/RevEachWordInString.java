package qsp;

public class RevEachWordInString 

{
	public static void main(String[] args) 
	{
		String s="welcome to java";
		String []words=s.split(" ");
		String reverseString="";
		for (String w : words) 
		{
			String reverseword="";

			for (int i = w.length()-1; i>=0; i--) 
			{
				reverseword=reverseword + w.charAt(i);
			}
			reverseString=reverseString + reverseword+" ";
		}
		System.out.println(reverseString);
	}
}

//ip: welcome to java
//op:  emoclew ot avaj

////reverse each word in a sentence 

