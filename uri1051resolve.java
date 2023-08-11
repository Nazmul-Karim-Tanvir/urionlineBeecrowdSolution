import java.io.IOException;
import java.util.Scanner;

public class uri1051resolve {
  public static void main(String[] args) throws IOException {
    Scanner sc =new Scanner(System.in);
    float n = sc.nextFloat();
    if(n <= 2000){
      System.out.print("Isento\n");
    }else{
      float  r, f1, f2, f3;
      if(n > 2000 && n <= 3000){
        f1 = n - 2000;
        f1 = ((f1 * 8) / 100);
        r = f1;
      }else if(n > 3000 && n <= 4500){
        f1 = n - 2000;
        f2 = f1 - 1000;
        f1 -= f2;
        f1 = ((f1 * 8) / 100);
        f2 = ((f2 * 18) / 100);
        r = f2 + f1;
      }else{
        f1 = n - 2000;
        f2 = f1 - 1000;
        f3 = f2 - 1500;
        f1 -= f2;
        f2 -= f3;
        f1 = ((f1 * 8) / 100);
        f2 = ((f2 * 18) / 100);
        f3 = ((f3 * 28) / 100);
        r = f3 + f2 + f1;
      }
      System.out.printf("R$ %.2f\n",r);
    }
    
  }
  
}