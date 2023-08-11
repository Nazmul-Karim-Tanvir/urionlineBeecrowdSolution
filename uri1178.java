import java.util.Scanner;
public class uri1178{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a[] = new double[100];
    double t = sc.nextDouble();
    double s=t;
    for(int i=0; i<100; i++){
      a[i]=s;
      s=s/2;
    }
    for(int k=0; k<100; k++){
      System.out.print("N["+k+"] = ");
      System.out.printf("%.4f\n",a[k]);
    }
  }
}
