import java.util.Scanner;
public class uri1079{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for(int i=1; i<=x; i++){
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      float c = sc.nextFloat();
      float a1 = a*2;
      float b1 = b*3;
      float c1 = c*5;
      float average = ((a1+b1+c1)/(2+3+5));
      System.out.printf("%.1f\n",average);
    }
  }
}
