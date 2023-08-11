import java.util.Scanner;
public class uri1177{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[1000];
    int t = sc.nextInt();
    for(int i=0,j=0; i<1000; j++,i++){
      a[i]=j;
      if(j==t-1){
        j=-1;
      }
    }
    for(int k=0; k<1000; k++){
      System.out.println("N["+k+"] = "+a[k]);
    }
  }
}
