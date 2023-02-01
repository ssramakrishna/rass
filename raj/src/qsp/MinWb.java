package qsp;

class MinWb 
{
    public static void main(String[] args) 
    {
      
        int a []={50,80,72,65,54};
        int min=a[0];
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i]; 
            }
        }
        System.out.println(min);
    } 
    
}