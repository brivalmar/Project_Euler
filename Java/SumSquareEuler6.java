import java.lang.Math;
public class SumSquareEuler6
{
  public static void main(String[] args)
  {
    int max = 100;
    double total = 0;
    double total2 = 0;
    for(int i = 1; i <= max; i++)
    {
      total = total + Math.pow(i, 2);
    }
    System.out.println("Total: " + total);
    for(int j = 1; j <= max; j++)
    {
      total2 = total2 + j;
    }
    System.out.println("Total2: " + (int)Math.pow(total2, 2));
    System.out.println("The difference is: " + (int)(Math.pow(total2, 2) - total));
  }
}
