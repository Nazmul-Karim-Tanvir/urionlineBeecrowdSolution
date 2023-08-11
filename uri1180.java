import java.util.Scanner;
public class uri1180{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0 ; i<a.length; i++){
      int x = sc.nextInt();
      a[i]=x;
    }
    int min = a[0];
    int minindex=0;
    for(int i=0; i<n; i++){
      if(a[i]<min){
        min = a[i];
        minindex=i;
      }
    }
      System.out.println("Menor valor: "+min);
      System.out.println("Posicao: "+minindex);
    
  }
}