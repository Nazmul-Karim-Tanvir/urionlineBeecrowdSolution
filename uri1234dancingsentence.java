import java.util.Scanner;
public class uri1234dancingsentence{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String m = s.replaceAll("\\s+","");
    String a[] = new String[m.length()];
    for(int i =0; i<a.length; i++){
      a[i]= m.substring(i,(i+1));
    }
    int count =0;
    for(int i=0; i<a.length; i++){
      if(a[i]==""){
        System.out.print("*");
      }
      if(a[i]!=""){
        if(count==0){
          String s1 = a[i].toUpperCase();
          System.out.print(s1);
          count =1;
        }
        else{
          String s2 = a[i].toLowerCase();
          System.out.print(s2);
          count=0;
        }
      }
    } 
    System.out.println();
  }
}