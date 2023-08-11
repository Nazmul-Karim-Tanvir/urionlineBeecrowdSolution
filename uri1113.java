import java.util.Scanner;
public class uri1113{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x,y;
    do{
      x = sc.nextInt();
      y = sc.nextInt();
      if(x>y){
      System.out.println("Decrescente"); 
      }
      else if(x<y){
        System.out.println("Crescente");
      }
    }while(x!=y);
  }
}