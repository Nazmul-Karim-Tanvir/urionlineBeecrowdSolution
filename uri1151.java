import java.util.Scanner;
public class uri1151{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t1 =0;
    int t2 =1;
    int number = sc.nextInt();
    for(int i=1; i<=number; i++){
      if(i==number){
        System.out.print(t1);
        int sum = t1+t2;
        t1 = t2;
        t2 = sum;
      }
      else{
        System.out.print(t1+" ");
        int sum = t1+t2;
        t1 = t2;
        t2 = sum;
      }
    }
    System.out.println();
  }
}