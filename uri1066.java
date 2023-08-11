import java.util.Scanner;
public class uri1066{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int even =0;
    int odd =0;
    int positive=0;
    int negative=0;
    for(int i =0; i<5; i++){
      int number = sc.nextInt();
      if(number%2==0){
        even++;
      }
      if(number%2!=0){
       odd++;
      }
      if(number>0){
        positive++;
      }
      if(number<0){
        negative++;
      }
    }
    System.out.println(even+" valor(es) par(es)");
    System.out.println(odd+" valor(es) impar(es)");
    System.out.println(positive+" valor(es) positivo(s)");
    System.out.println(negative+" valor(es) negativo(s)");
  }
}