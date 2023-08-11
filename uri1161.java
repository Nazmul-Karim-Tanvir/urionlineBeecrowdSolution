import java.util.Scanner;
public class uri1161{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int pro1=1;
    int pro2=1;
    for(int i=m; i>=1; i--){
      pro1*=i;
    }
    for(int i=n; i>=1; i--){
      pro2*=i;  
    }
    int sum = pro1+pro2;
    System.out.println(sum);
  }
}