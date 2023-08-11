import java.util.Scanner;
public class uri1866{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int c = sc.nextInt();
    for(int k=1; k<=c; k++){
      int sum=0;
      int n = sc.nextInt();
      for(int i=1; i<=n; i++){
        if(i%2==0){
          sum+=-1;
        }
        else{
          sum+=1;
        }
      }
      System.out.println(sum);
    }
  }
}