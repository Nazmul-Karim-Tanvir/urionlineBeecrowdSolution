import java.util.Scanner;
public class uri1189{
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
    sum+=a[1][0];
    sum+=a[2][0];
    sum+=a[3][0];
    sum+=a[4][0];
    sum+=a[5][0];
    sum+=a[6][0];
    sum+=a[7][0];
    sum+=a[8][0];
    sum+=a[9][0];
    sum+=a[10][0];
    
    sum+=a[2][1];
    sum+=a[3][1];
    sum+=a[4][1];
    sum+=a[5][1];
    sum+=a[6][1];
    sum+=a[7][1];
    sum+=a[8][1];
    sum+=a[9][1];
    
    sum+=a[3][2];
    sum+=a[4][2];
    sum+=a[5][2];
    sum+=a[6][2];
    sum+=a[7][2];
    sum+=a[8][2];
    
    sum+=a[4][3];
    sum+=a[5][3];
    sum+=a[6][3];
    sum+=a[7][3];
    
    sum+=a[5][4];
    sum+=a[6][4];
    
    if(s.equals("S")){ 
      System.out.printf("%.1f\n",sum);
    }
    
    else if(s.equals("M")){   
      average = sum/30;
      System.out.printf("%.1f\n",average);
    }
  }
}