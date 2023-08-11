import java.util.Scanner;
public class uri1158{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int j=0; j<n; j++){
      int x = sc.nextInt();
      int y = sc.nextInt();
      int sum=0;
      int count=0;
      for(int i=x; count!=y; i++){
        if(i%2!=0){
         sum+=i;
         count++;
        }
      }
      System.out.println(sum);
    }
  }
}