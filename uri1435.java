import java.util.Scanner;
public class uri1435{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n=0;
    do{
      n = sc.nextInt();
      int a[][] = new int[n][n];
      int div = n/2;
      if(n%2!=0){
        div++;
      }
      int start = 0;
      int end = n-1;
      for(int k =1; k<=div; k++){
        for(int i=start; i<=end; i++){
          for(int j=start; j<=end; j++){
            a[i][j]=k; 
          } 
        }
        start+=1;
        end-=1;
      }
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          System.out.print("   "+a[i][j]);
        }
        System.out.println();
      }
      System.out.println();
    }while(n!=0);
  }
}