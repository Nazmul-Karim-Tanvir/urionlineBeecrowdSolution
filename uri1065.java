import java.util.Scanner;
public class uri1065{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count=0;
    for(int i=0; i<5; i++){
      int number = sc.nextInt();
      if(number%2 ==0 || number%-2==0){
      count++;
      }
    }
    System.out.println(count+" valores pares");
  }
}
