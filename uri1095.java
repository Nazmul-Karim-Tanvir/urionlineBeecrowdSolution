import java.util.Scanner;
public class uri1095{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    for(int i=1,j=60; j>-1; i+=3,j-=5 ){
      System.out.println("I="+i+" J="+j);
    }
  }
}