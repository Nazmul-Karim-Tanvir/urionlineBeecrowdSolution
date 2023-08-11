import java.util.Scanner;
public class tanvir{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x = 5;
    int y = 3;
    
    int temp = x;
    x = y;
    y = temp;
    System.out.println(x+ "  "+ y);
      
  }
}