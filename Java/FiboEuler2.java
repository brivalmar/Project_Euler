public class FiboEuler2
{
  public static void main(String[] args)
  {
    int value1 = 1;
    int value2 = 1;
    final int LASTVALUE = 4000000;
    int total = 0;

    while(value2 < LASTVALUE)
    {
      int nextValue = value1 + value2;
      if(nextValue % 2 ==0)
      {
        total = total + nextValue;
      }
      value1= value2;
      value2 = nextValue;
    }
    System.out.println("The sum of Fibonacci numbers that are less than 4,000,000 is: " + total);
  }
}
