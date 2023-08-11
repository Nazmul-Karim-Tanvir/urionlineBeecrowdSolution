import java.util.Scanner;
public class uri1182{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l  = sc.nextInt();
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
      for(int j=0; j<12; j++){
        sum+=a[l][j];
      }   
      System.out.printf("%.1f\n",sum);
    }
    else if(s.equals("M")){
      for(int j=0; j<12; j++){
        sum+=a[j][l];
      } 
      
      average = sum/12;
      System.out.printf("%.1f\n",average);
    }
  }
}