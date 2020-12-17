import java.math.BigInteger;

class Main {
  public static void main(String[] args) {
    BigInteger fact = new BigInteger("100");
    int total = 0;
    for(int i = 99; i>=1; i--){
      //System.out.println("yeet "+ fact);
      fact = fact.multiply(BigInteger.valueOf(i));
    }
    String readfrom = ""+fact;
    //System.out.println(readfrom);
    for(int i = 0; i < readfrom.length(); i++){
      int temp2 = readfrom.charAt(i) -48;
      total += temp2;
    }
    
    System.out.println("total is "+ total);
  }
}