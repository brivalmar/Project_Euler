import java.math.BigInteger;

// Objective: Find the sum of the digits that make up 2^1000.

public class PowerSum_Euler16
{
  public static void main(String[] args)
  {
    BigInteger answer = new BigInteger("2").pow(1000);
    String toString = answer.toString();

    int[] digitSum = new int[toString.length()];
    int total = 0;
    for(int i = 0; i < digitSum.length; i++)
    {
      digitSum[i] = Integer.parseInt(toString.substring(i, i+1));
      total = total + digitSum[i];
    }
    System.out.println("Total of digits of the product of 2^1000: " + total);
  }
}
