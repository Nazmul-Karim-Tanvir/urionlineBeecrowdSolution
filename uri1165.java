import java.util.Scanner;
public class uri1165{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
      int x=sc.nextInt();
      int count=0;
      for(int j=2; j<x; j++){
        if(x%j==0){
          count++;
          break;
        }
      }
      if(count==0){
        System.out.println(x+" eh primo");
      }
      else{
        System.out.println(x+" nao eh primoo");
      }
    }
  }
}