import java.math.BigInteger;

class Main {
  
  public static void main(String[] args) {
    int count = 3;
    String output;
    //int Two = 1;
    //int One = 1;
    //int n = 2;
    BigInteger Two = new BigInteger("1");
    BigInteger One = new BigInteger("1");
    BigInteger n = new BigInteger("2");
    while(String.valueOf(n).length() < 1000){
      //Two = One;
      Two = (One);
      //One = n;
      One = (n);
      //n += Two;
      n = n.add(Two);
      count++;
      output = "" + n;
      //System.out.println(output + " " + count);
    }
    System.out.println(count);
  }
}