package qsp;

import java.util.Scanner;

public class Palindrome  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("its a polindrome");
		}
		else
		{
			System.out.println("its is not a polindrome");
		}
	}
}

//check whether the user entered number is palindrome or not
