import java.util.Scanner;
public class uri1061{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    
    String s = sc.nextLine();  
    String myarray[] = null;
    myarray = s.split(" ");  
    int a = Integer.parseInt(myarray[1]);
    
    String s1 = sc.nextLine();  
    String myarray1[] = null;
    myarray1 = s1.split(" : ");  
    int b1 = Integer.parseInt(myarray1[0]);
    int b2 = Integer.parseInt(myarray1[1]);
    int b3 = Integer.parseInt(myarray1[2]);
    
    String m = sc.nextLine();  
    String myarray2[] = null;
    myarray = m.split(" ");  
    int w = Integer.parseInt(myarray[1]);
    
    
    String m1 = sc.nextLine();  
    String myarray3[] = null;
    myarray3 = m1.split(" : ");  
    int b = Integer.parseInt(myarray3[0]);
    
    int bb = Integer.parseInt(myarray3[1]);
    
    int bbb = Integer.parseInt(myarray3[2]);
    
    int second1=0,second2 =0;
    second1 = (a*86400)+(b1*3600)+(b2*60)+b3;
    second2 = (w*86400)+(b*3600)+(bb*60)+bbb;
    int ts = second2-second1;
    
    int dia = ts/86400;
    int hora = (ts%86400)/3600;
    int minuto = ((ts%86400)%3600)/60;
    int segundo =((ts%86400)%3600)%60;
    System.out.println(dia+" dia(s)");
    System.out.println(hora+" hora(s)");
    System.out.println(minuto+" minuto(s)");
    System.out.println(segundo+" segundo(s)");
  }
}