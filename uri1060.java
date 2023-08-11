import java.util.Scanner;
public class uri1060{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    for(int i=0; i<6; i++){
      double number = sc.nextDouble();
      if(number>0){
        count++;
      }
    }
    System.out.println(count+" valores positivos");
  }
}