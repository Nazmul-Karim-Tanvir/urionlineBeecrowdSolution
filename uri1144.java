import java.util.Scanner;
public class uri1144{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      int a =i;
      int b =i*i;
      int c =i*i*i;
      int d =b+1;
      int e =c+1;
      System.out.println(a+" "+b+" "+c);
      System.out.println(a+" "+d+" "+e);
    }
  }
}