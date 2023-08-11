import java.util.Scanner;
public class uri1101{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    while(((x = sc.nextInt())>0) && ((y = sc.nextInt())>0)){
      int sum=0;
      if(x<y){
        for(int i=x; i<=y; i++){
          sum+=i;
          System.out.print(i+" ");
        }
      }
      else if(x>y){
        for(int i=y; i<=x; i++){
          sum+=i;
          System.out.print(i+" ");
        }
      } 
      System.out.println("sum="+sum);
    }
  }
}
