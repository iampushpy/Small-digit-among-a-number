import java.io.*;
class LargestFormed
{
 public static void main(String args[])throws IOException
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter total numbers: ");
        
  int n=Integer.parseInt(br.readLine());
  int i,j,large=0,l=0,count=0;
  int arr[]=new int[n];
   System.out.print("Enter elements: ");
   for(i=0;i<n;i++)
    {
      arr[i]=Integer.parseInt(br.readLine());
     }
   for(i=0;i<n;i++)
    {
       large=0;
        l=0;
      for(j=i;j<n;j++)
       {
         if(arr[j]>=large)
          {
           large=arr[j];
            l=j;
          }
         }
        arr[l]=arr[i];
        arr[i]=large;
        if(large==0)
            count++;
       }
   if(count==n)
      System.out.print(arr[0]);
    else
   {
   for(i=0;i<n;i++)
    {
      System.out.print(arr[i]);
     }
    }
  }
}


        
           
  