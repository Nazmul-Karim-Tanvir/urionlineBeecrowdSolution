import java.util.Scanner;
public class uri1132{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int sum=0;
    if(y>x){
      for(int i=x; i<=y; i++){
        if(i%13!=0){
          sum+=i;
        }
      }
    }
    else if(x>y){
      for(int i=y; i<=x; i++){
        if(i%13!=0){
          sum+=i;
        }
      }
    }
    System.out.println(sum);
  }
}
