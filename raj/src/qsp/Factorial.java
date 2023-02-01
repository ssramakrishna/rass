package qsp;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number");
		int s=sc.nextInt();
		int fact=1;
		for(int i=1;i<=s;i++)
		{
			fact=fact*i;

		}
		System.out.println(fact);
	}
}

//check  the   factorial of the given number by the user
