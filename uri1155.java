import java.util.Scanner;
public class uri1155{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double s =1;
    for(int i=2; i<=100; i++){
    double x = 1.0/i;
    s+=x;
    }
    System.out.printf("%.2f",s);
  }
}