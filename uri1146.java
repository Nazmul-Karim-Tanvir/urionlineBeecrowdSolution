import java.util.Scanner;
public class uri1146{
  public static void main(String[] args){
    int x;
    Scanner sc = new Scanner(System.in);
    while((x = sc.nextInt())!=0){
      for(int i=1; i<=x; i++){
        if(i==x){
          System.out.print(i+"\n");
        }
        else{
          System.out.print(i+" ");
        }
      }
    }  
  }
}