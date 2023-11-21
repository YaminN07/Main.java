public class Algorithm //4.1
{
  public int numDigits(int x)
  {
    String str=Integer.toString(x);
    x= str.length();
    return x;
  }
  public boolean isDivisible(int x ,int y)
  {
    boolean b=((x%y)==0);
    return b;
  }
  public int sumOfOddRange(int x,int y)
  {
    int sum=0;
    for (i=x, i<=y, i++)
    {
      if (i%2 !=0)
      {
        sum+=i;
      }
      sum+=0; 
    }
    return sum;
   }
  public int sumOfMultiple10Rage(int x, inty)
  {
    int sum=0;
    for (i=x, i<=y, i++)
    {
      if (i%10 ==0)
      {
        sum+=i;
      }
      sum+=0; 
    }
    return sum;
   }
  public int sumOfDigits(int x)
  {
    int sum=0;
    while(x>0)
    {
      sum+=x%10;
      x=x/10;  
    }
    return sum;
  }
}
