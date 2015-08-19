import java.math.BigInteger;
import java.util.ArrayList;

// Objective: Print the first Fibonacci number to have more than 1,000 digits.

public class FiboDigit_Euler25
{
  public static void main(String[] args)
  {
    ArrayList<BigInteger> fiboNum = new ArrayList<BigInteger>();

    BigInteger a = new BigInteger("1");
    fiboNum.add(a);
    BigInteger b = new BigInteger("1");
    fiboNum.add(b);
    BigInteger c = new BigInteger("0");

    boolean breaker = true;
    while(breaker)
    {
      c = a.add(b);
      a = b;
      b = c;
      fiboNum.add(c);
      if(BigInteger.valueOf(c.toString().length()).compareTo(new BigInteger("1000")) == 0)
      {
        System.out.println("Index of first 1,000 digit number: " + (fiboNum.indexOf(c) + 1)); //Add 1 to account for the sequence starting at 1, not 0.
        breaker = false;
      }
    }
  }
}
