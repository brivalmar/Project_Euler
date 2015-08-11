public class MultipleEuler5
{
  public static void main(String[] args)
  {
    int start = 1;
    int count = 0;
    int maxNum = 20;
    boolean divisible = false;
    while(!divisible)
    {
      for(int i = 1; i <= maxNum; i++)
      {
        if(start % i == 0)
        {
          count++;
          if(count == maxNum)
          {
            System.out.println("Smallest number divisible by 1-20: " + start);
            divisible = true;
          }
        }
      }
      count = 0;
      start++;
    }
  }
}
