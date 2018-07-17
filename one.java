class one
{
 public static void main(String args[])
 {
  int n=Integer.parseInt(args[0]);
  int i,j,flag,k=0;
  char ch,ch1,z;
  char arr[]=new char[n];
  for(i=0;i<n;i++)
  {
   flag=0;
   ch=args[1].charAt(i);
    for(j=0;j<n;j++)
     {
       ch1=args[1].charAt(j);
       if(ch==ch1)
         {
           flag++;
          }
       }
      if(flag==1)
        {
          arr[k]=(ch);
           k++;
         }
    }
   for(i=0;i<n;i++)
  {
     for(j=0;j<(n-i-1);j++)
      {
         if(arr[j]>arr[j+1])
          {
            z=arr[j];
            arr[j]=arr[j+1];
               arr[j+1]=z;
            }
        }
    }
   for(i=0;i<n;i++)
  {
    System.out.print(arr[i]+" ");
   }
  }
 }