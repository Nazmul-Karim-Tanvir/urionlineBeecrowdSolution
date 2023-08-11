import java.util.Scanner;
public class uri1099{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int j=0; j<n; j++){
      int sumodd =0;
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(x<y){
        for(int i=x+1; i<y; i++){
          if(i%2!=0){
            sumodd+=i;
          }
        }
      }
      if(x>y){
        for(int i=y+1; i<x; i++){
          if(i%2!=0){
            sumodd+=i;
          }
        }
      }
      System.out.println(sumodd);
    }
  }
}