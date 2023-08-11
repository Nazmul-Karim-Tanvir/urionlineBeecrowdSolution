import java.util.Scanner;
public class uri1154{
  public static void main(String [] args){
    int x;
    double sum=0;
    int count=0;
    Scanner sc = new Scanner(System.in);
    while((x=sc.nextInt())>0){
      sum+=x; 
      count++;
    }
    double average=0;
    average = sum/count;
    System.out.printf("%.2f\n",average);
  }
}