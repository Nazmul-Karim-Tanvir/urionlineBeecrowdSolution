import java.util.Scanner;
public class uri1176{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long fibo[] = new long[61];
    int t = sc.nextInt();
    fibo[0] = 0;
    fibo[1] = 1;
    for(int i=2; i<61; i++){
     fibo[i]=fibo[i-1]+fibo[i-2];
    }
    for(int i=0; i<t; i++){
    int x = sc.nextInt();
    System.out.println("Fib("+x+") = "+fibo[x]);
    }
  }
}