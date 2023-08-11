import java.util.Scanner;
public class uri1047{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int hour =0;
    int minute =0;
    if(a==c && b==d){
      hour =24;
      System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
    }
    else if(b<d || b==d){
      minute=d-b;
      if(a>c){
        hour = (24-a)+c;
        System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
      }
      else{
        hour =c-a;
        System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
      }
    }
    else if(b>d){
      minute = b-d;
      if(a>c){
        hour = (24-a)+c;
        int f=hour*60;
        int e = f-minute;
        hour = e/60;
        minute = e%60;
        System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
      }
      else if(a==c){
        hour = 24;
        int f=hour*60;
        int e = f-minute;
        hour = e/60;
        minute = e%60;
        System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
      }
      else{
        hour = c-a;
        int f=hour*60;
        int e = f-minute;
        hour = e/60;
        minute = e%60; 
        System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
      }
    }
  }
}
