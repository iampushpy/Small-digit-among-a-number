class SmallDigit
{
 public static void main(String args[])
 {
  int k=Integer.parseInt(args[1]);
  int i=0,j=0;
  char ch,ch1;
  int ran=0,count=0,flag=0;
  String s=" ";
  String s1;
  int l=args[0].length();
  for(i=0;i<l-1;i++)
  {
    ch=args[0].charAt(i);
    ch1=args[0].charAt(i+1);
     if(ch<=ch1)
       {
          s=s+ch;
          System.out.println(s);
        }
     else if(ch>=ch1)
        {
          count++;
          
          continue;
         }

      if((s.length()-1)==(l-k))
       {
         flag=1;
         break;
       }

 }
 if(flag==1)
 {
   System.out.println(s);
  }
  else
  {
    if(count==k)
    {
      ran=l-k;
      s1=args[0].substring(ran);
      s=s+s1;
      System.out.println(s);
     }
    else if(s.equals(" "))
    {
      ran=k-(s.length()-1);
      ran=(l)-ran;
      s1=args[0].substring(ran);
      s=s+s1;
      System.out.println(s);
       }
     
    }
}
}