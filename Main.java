public class Algorithm
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
    int z=x;
    while (z>x && z<y)
    {
      if (z%2)
      {
        x++; 
      } else {
        x+1;
      
}
