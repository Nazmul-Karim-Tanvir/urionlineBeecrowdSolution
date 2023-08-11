import java.util.Scanner;
public class uri1134{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=0;
    int alcohol =0;
    int gasoline =0;
    int diesel =0;
    int count=0;
    while(n!=4){
      n = sc.nextInt();
      if(n<1 && n>4){
        n = sc.nextInt();
      }else{
        if(n==1){
          alcohol++;
          count++;
        }
        else if(n==2){
          gasoline++;
          count++;
        }
        else if(n==3){
          diesel++;
          count++;
        }
      }
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alcohol);
    System.out.println("Gasolina: "+gasoline);
    System.out.println("Diesel: "+diesel);    
  }
}
