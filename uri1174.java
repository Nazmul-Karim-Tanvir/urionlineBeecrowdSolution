import java.util.Scanner;
public class uri1174{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a[] = new double[100];
    
    for(int i=0 ;i<100; i++){
      double x = sc.nextDouble();
      a[i]=x;
      x =x*2;
    }
    for(int i=0; i<100; i++){
      if(a[i]<=10){
        System.out.println("A["+i+"] = "+a[i]);
      }
    }
  }
}