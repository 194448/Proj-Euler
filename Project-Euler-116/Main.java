class Main {
  public static long[] temp;
  public static long calc(int x, int n){
    long total = 0;
    if(n>x){
      return total;
    }
    if(temp[x] != 0){
      return temp[x];
    }
    for(int i = 0; i<=x-n; i++){
      total++;
      total += calc(x - i - n, n);
    }
    temp[x] = total;
    return total;
  }
  public static void main(String[] args) {
    long total = 0;
    int greys = 50;
    int nred = 2;
    int nblue = 4;
    for(int i = nred; i<= nblue; i++){
      temp = new long[(greys+1)];
      total += calc(greys, i);
    }
    System.out.println(total);
  }
}