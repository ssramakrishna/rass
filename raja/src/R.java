import java.util.Scanner;

public class R 
{
	public int ArrayChallenge(int[] arr)
	{
		int i, j, temp, n=arr.length;
		for(i=0; i<n-1; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(arr[i] < arr[j])
				{
					temp=arr[i];

					arr[i]=arr[j];

					arr[j]=temp;
				}
			}
		}
		int sum=0;

		for(i=0; i<4; i++)

		{ 
			sum+=arr[i];
		}

		return sum;
	}
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
	  a=myInput.nextint();
		System.out.println(ArrayChallenge(r));

	}
}

