import java.util.Scanner;
public class uri1071{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int sum =0;
    for(int i=y+1; i<=x-1; i++){
      if(i%2!=0){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}