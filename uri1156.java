import java.util.Scanner;
public class uri1156{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double s =1;
    for(double i=3,j=2; i<=39; i+=2,j*=2){
    double x = i/j;
    s+=x;
    }
    System.out.printf("%.2f\n",s);
  }
}