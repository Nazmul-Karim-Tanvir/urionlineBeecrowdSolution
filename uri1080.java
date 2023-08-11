import java.util.Scanner;
public class uri1080{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int max =number;
    int maxindex =1;
    for(int i=2; i<=100; i++){
      int number1 = sc.nextInt();
      if(number1>max){
        max = number1;
        maxindex=i;
      }
    }
    System.out.println(max);
    System.out.println(maxindex);
  }
}