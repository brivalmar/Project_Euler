import java.math.BigInteger;

// Objective: Find the last ten digits of 1^1 + 2^2 + 3^3 + ... + 1000^1000.

public class SelfPowers_Euler48
{
  public static void main(String[] args)
  {
    BigInteger last;
    BigInteger answers;
    BigInteger total = new BigInteger("0");
    for(int i = 1; i <= 1000; i++)
    {
      answers = BigInteger.valueOf(i);
      last = answers.pow(i);
      total = total.add(last);
    }
    String totalToString = total.toString();
    for(int j = totalToString.length()-10; j < totalToString.length(); j++)
    {
      System.out.print(totalToString.substring(j,j+1));
    }
  }
}
