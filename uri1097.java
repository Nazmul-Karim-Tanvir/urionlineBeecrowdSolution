import java.util.Scanner;
public class uri1097{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a =1;
    int b =a+2;
    int c =b+2;
    int d =c+2;
    int e =d+2;
    
    int J =a+6;
    int k =b+6;
    int l =c+6;
    int m =d+6;
    int n =e+6;
    for(int i=0; i<3; i++){
       System.out.println("I="+a+" J="+J);
      J--;
    }
    for(int i=0; i<3; i++){
       System.out.println("I="+b+" J="+k);
      k--;
    }
    for(int i=0; i<3; i++){
       System.out.println("I="+c+" J="+l);
      l--;
    }
    for(int i=0; i<3; i++){
       System.out.println("I="+d+" J="+m);
      m--;
    }
    for(int i=0; i<3; i++){
       System.out.println("I="+e+" J="+n);
      n--;
    }
  }
}
