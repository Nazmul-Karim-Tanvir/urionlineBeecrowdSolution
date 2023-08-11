import java.util.Scanner;
public class uri1051{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    
    if(a<=2000.00){
      System.out.println("Isento");
    }else{
      float b = 0;
      float c = 0;
      float d = 0;
      float totalsum = 0;
      float tax1 =0;
      float tax2 =0;
      float tax3 =0;
      float totaltax =0;
      if(a>=2000.01 && a<=3000.00){
        b = a-2000;
        tax1 = ((b*8)/100);
        totaltax = tax1;
      }
      else if(a>=3000.01 && a<=4500.00){
        b = a-2000;
        b = b-(a%3000);
        c = a-3000;
        tax1 = ((b*8)/100);
        tax2 = ((c*18)/100);
        totaltax = tax1+tax2;
      }
      else if(a>4500){
        b = a-2000;
        b = b-(a%3000);
        c = a-3000;
        c = c-(a%4500);
        d = a-4500;
        tax1 = ((b*8)/100);
        tax2 = ((c*18)/100);
        tax3 = ((d*28)/100);
        totaltax = tax1+tax2+tax3;
      }
      System.out.printf("R$ %.2f\n",totaltax);
    }
  }
}