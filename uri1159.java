import java.util.Scanner;
public class uri1159{
  public static void main(String[] args){
    int x;
    Scanner sc = new Scanner(System.in);
    while(( x = sc.nextInt())!=0){
      int sum=0;
      int count=0;
      for(int i=x; count<5; i++){
        if(i%2==0){
          sum+=i;
          count++;
        }
      }
      System.out.println(sum); 
    }
  }
}