import java.util.Scanner;
public class uri1179{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    int b[] = new int[5];
    int acount=0;
    int bcount=0;
    for(int i=0; i<15; i++){
      int x = sc.nextInt();
      if(x%2==0){
        b[bcount]=x;
        bcount++;
      }
      if(x%2!=0){
        a[acount]=x;
        acount++;
      }
      if(bcount==5){
        for(int j=0; j<b.length; j++){
          System.out.println("par["+j+"] = "+b[j]);
        }
        bcount=0;
      }
      if(acount==5){
        for(int k=0; k<a.length; k++){
          System.out.println("impar["+k+"] = "+a[k]);
        }
        acount=0;
      }   
    }
    for(int l=0; l<acount; l++){
      System.out.println("impar["+l+"] = "+a[l]);
    }
    for(int m=0; m<bcount; m++){
      System.out.println("par["+m+"] = "+b[m]);
    }
  }
}