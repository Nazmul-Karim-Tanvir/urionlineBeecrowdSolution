import java.util.Scanner;
public class uri1190{
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
    int m =10;
    for(int i=1; i<=5; i++){
      for(int j=11; j>m; j-- ){
        sum+=a[i][j];
      }
      m--;
    }
    for(int i=6; i<11; i++){
      for(int j=i+1; j<=11; j++ ){
        sum+=a[i][j];
      }
    }
    
    
    if(s.equals("S")){ 
      System.out.printf("%.1f\n",sum);
    }
    
    else if(s.equals("M")){   
      average = sum/30;
      System.out.printf("%.1f\n",average);
    }
  }
}