import java.util.Scanner;
public class uri1150{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int z;
    int sum=x;
    int count=1;
    while((z=sc.nextInt())<=x);
    for(int i=x+1; sum <=z; i++){
      sum = sum+i;
      count++;
    }
    System.out.println(count);
  }
}