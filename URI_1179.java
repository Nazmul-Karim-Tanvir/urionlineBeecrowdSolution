import java.util.Scanner;

public class URI_1179 {

 public static void main(String[] args) {
  Scanner input =new Scanner(System.in);
  int par[] =new int[5];
  int impar[] =new int[5];
  
  int x, i, j, total;
  for ( i = 0; i < 15; i++) {
   x = input.nextInt();
   if( x % 2 == 0){
    par[i] = x;
   }else {
    impar[i] = x;
   }
  }
  for ( i = 0; i < 15; i++) {
   System.out.print("par[i] = "+par[i]+"\n");
   System.out.print("impar[i] = "+impar[i]+"\n");
  }

 }

}