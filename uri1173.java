import java.util.Scanner;
public class uri1173{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    int x = sc.nextInt();
    for(int i=0 ;i<10; i++){
      a[i]=x;
      x =x*2;
    }
    for(int i=0; i<10; i++){
      System.out.println("N["+i+"] = "+a[i]);
    }
  }
}