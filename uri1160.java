import java.io.IOException;
import java.util.Scanner;
public class uri1160{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    System.out.println(t);
    for(int j=0; j<t; j++){
      int pa = sc.nextInt();
      int pb = sc.nextInt();
      double g1 = sc.nextDouble();
      double g2 = sc.nextDouble();
      int na =0;
      int nb =0;
      int count=1;
      for(int i=0; count<101; i++){
        
        pa = pa + (int)(pa*(g1/100));
        pb = pb + (int)(pb*(g2/100));
        
        if(pa>pb){
          System.out.println(count+" anos.");
          break;
        }
        else 
          count++;
      }
      if(count ==101){
        System.out.println("Mais de 1 seculo.");
        }
    }
  }
}