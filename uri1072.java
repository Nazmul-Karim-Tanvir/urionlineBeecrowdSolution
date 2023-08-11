import java.util.Scanner;
public class uri1072{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int in=0;
    int out=0;
    int quantity = sc.nextInt();
    for(int i=1; i<=quantity; i++){
      int number = sc.nextInt();
      if(number>=10 && number<=20){
        in++;
      }
      else{
        out++;
      }
    }
    System.out.println(in+" in");
    System.out.println(out+" out");
  }
}