import java.util.Scanner;
public class uri1175{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[20];
    int b[] = new int[20];
    int k=0;
    int l=19;
    
    for(int i=0; i<20; i++){
      int x = sc.nextInt();
      b[i]=x;
    }
    for(int i=19; i>9; i--){
      a[i] = b[k];
      k++;
    }
    for(int i=0; i<10; i++){
      a[i] = b[l];
      l--;
    }
    for(int i=0; i<20; i++){
      System.out.println("N["+i+"] = "+a[i]);
    }
  }
}