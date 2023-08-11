import java.util.Scanner;
public class uri2006{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int correct =0;
    if(t==a){
      correct++;
    }
    if(t==b){
      correct++;
    }
    if(t==c){
      correct++;
    }
    if(t==d){
      correct++;;
    }
    if(t==e){
      correct++;
    }
    System.out.println(correct);
  }
}