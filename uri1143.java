import java.util.Scanner;
public class uri1143{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a=1; 
    int b=1; 
    int c=1;
    for(int i=0; i<n; i++){
      System.out.println(a+" "+b+" "+c);
      a = a+1;
      b = a*a;
      c = a*a*a;
    }
  }
}