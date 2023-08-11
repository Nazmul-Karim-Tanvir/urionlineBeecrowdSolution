import java.util.Scanner;
public class uri1164{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      int sum=0;
      int number = sc.nextInt();
      for(int j=1; j<number; j++){
        if(number%j==0){
          sum = sum+j;
        }
      }
      if(sum==number){
        System.out.println(number+" eh perfeito");
      }
      if(sum!=number){
        System.out.println(number+" nao eh perfeito");
      }
    }
  }
}