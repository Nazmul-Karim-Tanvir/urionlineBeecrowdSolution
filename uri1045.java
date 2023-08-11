import java.util.Scanner;
public class uri1045{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double array[] ={0,0,0};
    for(int i=0; i<3; i++){
      Double collect = sc.nextDouble();
      array[i] = collect;
    }
    for(int i =0; i<3; i++){
      for(int j =i+1; j<3; j++){
        if(array[i]<array[j]){
          double temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    double a = array[0];
    double b = array[1];
    double c = array[2];
    double e = b+c;
    double f = a*a;
    double g = b*b;
    double h = c*c;
    double i = g+h;
    if(a>=(e)){
      System.out.println("NAO FORMA TRIANGULO");
    }else{
      if(f==i){
        System.out.println("TRIANGULO RETANGULO");
      }
      if(f>i){
        System.out.println("TRIANGULO OBTUSANGULO");
      }
      if(f<i){
        System.out.println("TRIANGULO ACUTANGULO");
      }
      if((a==b)&& (a==c)){
        System.out.println("TRIANGULO EQUILATERO");
      }
      if((a==b) || (a==c) || (b==c)){
        if(((a==b) && (a!=c)) || ((a==c) && (a!=b)) || ((b==a)&&(b!=c))||((b==c)&&(b!=a))|| ((c==a)&&(c!=b)) ||((c==b)&&(c!=a))){
          System.out.println("TRIANGULO ISOSCELES");    
        }
      }
    }
  }
}