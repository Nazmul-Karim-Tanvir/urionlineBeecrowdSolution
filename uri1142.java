import java.util.Scanner;
public class uri1142{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 1;
    int b = 2;
    int c = 3;
    for(int i=0; i<n; i++){
      System.out.println(a+" "+b+" "+c+" PUM");
      a+=4;
      b+=4;
      c+=4;
    }
  }
}