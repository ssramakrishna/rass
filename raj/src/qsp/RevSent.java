package qsp;

class RevSent 
{
	public static void main(String[] args) 
	{
		String str="player favourite my is dhoni ms";
		String[] s1=str.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
}