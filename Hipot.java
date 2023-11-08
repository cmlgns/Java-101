import javax.swing.plaf.basic.BasicLookAndFeel;
import java.util.Scanner;
public class Hipot {
    public static void main (String[] args){
     int a,b;
     Scanner verial =new Scanner(System.in);
     System.out.print ("Dik  Üçgenin birinci kenarını giriniz: ");
      a=verial.nextInt();
      System.out.print ("Dik  Üçgenin  ikininci kenarını giriniz: ");
      b=verial.nextInt();
     Double c= Math.sqrt((a*a)+(b*b)) ;
      System.out.println ("Dik  Üçgenin  hipotenüsü: "+ c ) ;
      Double u= (a+b+c);
      System.out.println (" Üçgenin Çevresi  :"+ (a+b+c) ) ;
      Double alan = ( u * (u-a)*(u-b)*(u-c)) ;
     System.out.println (" Üçgenin alanı  :"+ alan ) ;
    }

}
