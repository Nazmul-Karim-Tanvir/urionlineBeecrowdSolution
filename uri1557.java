import java.util.Scanner;
public class uri1557{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int t=0;
    do{ 
      t= sc.nextInt();
      if(t!=0){
        int a[][] = new int [t][t];
        int k=1;
        int l=1;
        for(int i=0; i<t; i++){
          for(int j=0; j<t; j++){
            a[i][j]=k;
            k=k*2;
          }
          l=l*2;
          k=l; 
        }
        int length2 = String.valueOf(a[t-1][t-1]).length();
        for(int i=0; i<t; i++){
          for(int j=0; j<t; j++){
            int length1 = String.valueOf(a[i][j]).length();
            if(length1<length2){
              int length3 =length2-length1;
              for(int g = 1; g<=length3; g++){
                System.out.print(" ");
              }
            }
            if( j==(t-1)){
            System.out.print(a[i][j]+"\n");
            }
            else{
            System.out.print(a[i][j]+" ");
            }
          }  
        }System.out.printf("\n");
      }
      
    }while(t!=0);
  }
}