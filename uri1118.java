import java.util.Scanner;
public class uri1118{
  public static void main(String[] args){  
    Scanner sc = new Scanner(System.in);
    int count1=0;
    float sum1=0;
    float average1=0;
    do{
      float n1 = sc.nextFloat();
      if(n1<0.0 || n1>10.0){
        
        System.out.println("nota invalida");
      }
      else if(n1>=0.0 || n1<=10.0){
        sum1 = sum1+n1;
        count1++;
      } 
    }while(count1!=2);
    if(count1==2){
      average1 = sum1 / 2;
      System.out.printf("media = %.2f\n",average1);
      System.out.println("novo calculo (1-sim 2-nao)");
    }
    int x;
    do{
      
      x = sc.nextInt();
      if(x==1){
        int count=0;
        float sum=0;
        float average=0;
        do{
          float n = sc.nextFloat();
          if(n<0.0 || n>10.0){
            
            System.out.println("nota invalida");
          }
          else if(n>=0.0 || n<=10.0){
            sum = sum+n;
            count++;
          } 
        }while(count!=2);
        if(count==2){
          average = sum / 2;
          System.out.printf("media = %.2f\n",average);
          System.out.println("novo calculo (1-sim 2-nao)");
        }
      }
      else if(x<1|| x>2){
        System.out.println("novo calculo (1-sim 2-nao)");
      }
    }while(x!=2);   
  }
}
