import java.util.Scanner;
public class uri1172{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0 ;i<10; i++){
      int x = sc.nextInt();
      if(x<0 || x==0){
        a[i] =1;
      }
      else
        a[i] = x;
    }
    for(int i=0; i<10; i++){
      System.out.println("X["+i+"] = "+a[i]);
    }
  }
}