import java.math.BigInteger;
import java.util.ArrayList;

// Objective: Find the sum of the digits in the number 100!

public class FactorialEuler20
{
  public static void main(String[] args)
  {
    BigInteger product = new BigInteger("1");
    BigInteger i;
    for(i = new BigInteger("100"); i.compareTo(new BigInteger("0")) == 1; i = i.subtract(new BigInteger("1")))
    {
      product = product.multiply(i);
    }
    String num = product.toString();

    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int j = 1; j < num.length(); j++)
    {
      list.add(Integer.parseInt(num.substring(j-1, j)));
    }

    int total = 0;
    for(int k = 0; k < list.size()-1; k++)
    {
      total = total + list.get(k);
    }
    System.out.println("Total of values that make up 10!: "+ total);
  }
}
