import java.util.Scanner;
public class uri1188{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    double sum =0;
    double average =0;
    double a[][] = new double[12][12];
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        double x = sc.nextDouble();
        a[i][j] =x;
      }
    }
    int k=5;
    int l=6;
    for(int i=7; i<12; i++){
      for(int j=k; j<=l; j++){
        sum+=a[i][j];
      }
      k--;
      l++;
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