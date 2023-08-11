import java.util.Scanner;
public class uri1114{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int y =2002;
    int x;
    do{
      x=sc.nextInt();
      if(x==y){
        System.out.println("Acesso Permitido");
      }
      else{
        System.out.println("Senha Invalida"); 
      }  
    }while(x!=y);
  }
}