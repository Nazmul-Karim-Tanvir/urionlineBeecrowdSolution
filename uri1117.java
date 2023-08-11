import java.util.Scanner;
public class uri1117{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float x;
    int count =0;
    float total =0;
    
    while(count!=2){
      x = sc.nextFloat(); 
      
      if(x>=0.0 && x<=10.0){
        count++;
        total+=x;
      }
      else if(x<0 || x>10){
        System.out.printf("nota invalida\n");
      }
    }
    float average=0;
    average = total/2;
    if(count==2){
      System.out.printf("media = %.2f\n",average);
    }
  }
}