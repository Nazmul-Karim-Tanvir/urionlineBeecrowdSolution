import java.util.Scanner;
public class uri1094{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int alltotal=0;
    int totalc =0;
    int totalr =0;
    int totals =0;
    int x = sc.nextInt();
    sc.nextLine();
    for(int i=0; i<x; i++){ 
      String s = sc.nextLine();  
      String a[] = null;
      a = s.split(" ");  
      int m = Integer.parseInt(a[0]);
      alltotal+=m;
      String m1 = a[1];
      if(m1.equals("C")){
        totalc+=m;
      }
      if(m1.equals("R")){
        totalr+=m;
      }
      if(m1.equals("S")){
        totals+=m;
      }
    }
    double totalc1 = totalc;
    totalc1 = (totalc*100.0)/alltotal;
    double totalr1 = totalr;
    totalr1 = (totalr*100.0)/alltotal;
    double totals1 = totals;
    totals1 = (totals*100.0)/alltotal;
    
    System.out.println("Total: "+alltotal+" cobaias");
    System.out.println("Total de coelhos: "+totalc);
    System.out.println("Total de ratos: "+totalr);
    System.out.println("Total de sapos: "+totals);
    System.out.printf("Percentual de coelhos: %.2f",totalc1);
    System.out.println(" %");
    System.out.printf("Percentual de ratos: %.2f",totalr1);
    System.out.println(" %");
    System.out.printf("Percentual de sapos: %.2f",totals1);
    System.out.println(" %");
  }
}