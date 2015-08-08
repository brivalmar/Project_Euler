public class Euler1
{


  public static void main(String[] args)
  {
    int total = 0;
    for(int i = 0; i < 1000; i++)
    {
      if(i % 3 == 0 || i % 5 == 0)
      {
        total = total + i;
      }
    }
    System.out.println("The sum of numbers divisible by 3 and 5 that are less than 1000 is: " + total);
  }
}
