import java.util.ArrayList;

public class FiboEuler2
{
  public static void main(String[] args)
  {
    int startingValue = 1;
    int secondValue = 2;
    int nextValue = 0;
    int lastValue = 4000000;
    int total = 0;
    ArrayList<Integer> fiboNumb = new ArrayList<Integer>();
    fiboNumb.add(startingValue);
    fiboNumb.add(startingValue);
    fiboNumb.add(secondValue);
    for(int i = 2; fiboNumb.get(i) < lastValue; i++)
    {
      if(fiboNumb.get(i) < lastValue)
      {
        fiboNumb.add(fiboNumb.get(i)+fiboNumb.get(i-1));
      }
      if(fiboNumb.get(i) % 2 == 0)
      {
        total = total + fiboNumb.get(i);
      }
    }
    System.out.println("The sum of Fibonacci numbers that are less than 4,000,000 is: " + total);
  }
}
