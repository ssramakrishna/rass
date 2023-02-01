package qsp;

class Desc 
{
    public static void main(String[] args) 
    {
       int a[]={80,45,87,96,46,32};
       
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a.length;j++)
           {
               
               if(a[i]>a[j])
               {
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                
               }
           }
       }
       for(int k=0;k<a.length;k++)
       {
           System.out.println(a[k]);
       }
    }
}
