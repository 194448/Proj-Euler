
/*
Thomas Tipper Festing
2020-12-17
Proj Euler 421 program
*/

import java.math.BigInteger;
import java.util.LinkedList;

class Main {

  public static BigInteger primeLimit = BigInteger.TEN.pow(3);
  public static String convertLimit = primeLimit.toString();
  public static int primeInt = Integer.parseInt(convertLimit);

  public static LinkedList<Integer> PrimeChecks = new LinkedList<Integer>();

  public static void SieveOfEratosthene(int n) {
    LinkedList<Boolean> prime = new LinkedList<Boolean>();
    for (long i = 0; i < n + 1; i++) {
      prime.add(Math.toIntExact(i), true);
    }
    for (long i = 2; i * i <= n; i++) {// using longs because 2^31 − 1 < (10^8)^2
      if (prime.get(Math.toIntExact(i)) == true) {
        // System.out.println("working");
        for (long j = i * i; j <= n; j += i) {
          prime.set(Math.toIntExact(j), false);
        }
      }
    }
    for (long i = 2; i <= n; i++) {
      if (prime.get(Math.toIntExact(i)) == true) {
        PrimeChecks.add(Math.toIntExact(i));
        // System.out.print(i+" ");
      }

    }
    // System.out.println(PrimeChecks);
  }

  public static void main(String[] args) {
    SieveOfEratosthene(primeInt);
    BigInteger total = BigInteger.valueOf(0);
    //long total = 0;
    BigInteger n = BigInteger.TEN.pow(6);
    for (BigInteger i = n; i.compareTo(BigInteger.ZERO) > 0; i = i.subtract(BigInteger.ONE)) {
      //System.out.println(""+total);
      BigInteger temp = BigInteger.valueOf(0);
      for (int j = 0; j < PrimeChecks.size(); j++) {
        temp = i.pow(15).add(BigInteger.ONE);
        if (temp.mod(BigInteger.valueOf(PrimeChecks.get(j))) == BigInteger.ZERO) {
          total = total.add(BigInteger.valueOf(PrimeChecks.get(j)));

          for (int on = 1; on > 1; on++) {
            temp.divide(BigInteger.valueOf(PrimeChecks.get(j)));
            if(temp.mod(BigInteger.valueOf(PrimeChecks.get(j))) == BigInteger.ZERO){
              on = 0;
            }
          }
        }
        
      }
    }
    System.out.println("" + total);

  }
}