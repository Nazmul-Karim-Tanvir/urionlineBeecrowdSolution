import java.util.Scanner;
public class uri1186{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    float sum =0;
    float average =0;
    float a[][] = new float[12][12];
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        float x = sc.nextFloat();
        a[i][j] =x;
      }
    }
    if(s.equals("S")){
      int k=1;
      for(int i=12-1; i>0; i--){
        for(int j=k; j<12; j++){
          
          sum+=a[i][j];
          
        }
        k++;
      }
      System.out.printf("%.1f\n",sum);
    }
    else if(s.equals("M")){
      int k=1;
      for(int i=12-1; i>0; i--){
        for(int j=k; j<12; j++){
          
          sum+=a[i][j];
          
        }
        k++;
      } 
      
      average = sum/66;
      System.out.printf("%.1f\n",average);
    }
  }
}