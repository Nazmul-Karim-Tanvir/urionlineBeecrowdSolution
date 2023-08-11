import java.util.Scanner;
public class uri1098{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float a1 =0;
    float k1 =1;
    float l1 =2;
    float m1 =3;
    for(int i=0; a1<=2.1; i++){
      if(i ==0 || i==10 || i==5){
      System.out.printf("I=%.0f j=%.0f\n",a1,k1);
      System.out.printf("I=%.0f j=%.0f\n",a1,l1);
      System.out.printf("I=%.0f j=%.0f\n",a1,m1);
      }
      else{
      System.out.printf("I=%.1f j=%.1f\n",a1,k1);
      System.out.printf("I=%.1f j=%.1f\n",a1,l1);
      System.out.printf("I=%.1f j=%.1f\n",a1,m1);
      }
      a1=a1+0.2f;
      k1=k1+0.2f;
      l1=l1+0.2f;
      m1=m1+0.2f;    
    }
  }
}