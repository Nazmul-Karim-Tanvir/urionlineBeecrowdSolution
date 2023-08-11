import java.util.Scanner;
public class uri1131{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int inter=0;
    int gremio=0;
    int draw=0;
    int x;
    int num1 =  sc.nextInt();
    int num2 =  sc.nextInt();
    if(num1 >num2){
      inter++;
    }
    else if(num1<num2){
      gremio++;
    }
    else if(num1==num2){
      draw++;
    }
    do{
      System.out.println("Novo grenal (1-sim 2-nao)");
      x =sc.nextInt();
      if(x==1){
        int number1 =  sc.nextInt();
        int number2 =  sc.nextInt();
        if(number1 >number2){
          inter++;
        }
        else if(number1<number2){
          gremio++;
        }
        else if(number1==number2){
          draw++;
        }
      }
      //else {
      //  System.out.println("Novo grenal (1-sim 2-nao)");
      //}
      
    }while(x!=2);
    System.out.println(inter+gremio+draw+" grenais");
    System.out.println("Inter:"+inter);
    System.out.println("Gremio:"+gremio);
    System.out.println("Empates:"+draw);
    if(inter == gremio){
      System.out.println("Não houve vencedor");
    }
    else if(inter >gremio){
      System.out.println("Inter venceu mais");
    }
    else if(inter <gremio){
      System.out.println("Gremio venceu mais");
    }
  }
}