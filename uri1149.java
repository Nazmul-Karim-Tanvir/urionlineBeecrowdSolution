import java.util.Scanner;
public class uri1149{
  public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int sum=0;
    while((n=sc.nextInt())<1);
    for(int i=0; i<n; i++){
      sum = sum+a+i; 
    }
    System.out.println(sum);
  }
}