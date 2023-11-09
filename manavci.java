import java.util.Scanner;
public class manavci  {
 public static void main(String [] args) {
     Double elma = 23.67, armut = 21.4, domates = 31.11, muz = 40.95, patlican = 25.00;
     Double elmaK, armutK, domatesK, muzK, patlicanK,toplam;
     Scanner verial = new Scanner(System.in);
     System.out.print(" Armut Kaç Kilo : ");
     armutK = verial.nextDouble();
     System.out.print(" Elma Kaç Kilo : ");
     elmaK = verial.nextDouble();
     System.out.print(" Armut Kaç Kilo : ");
     domatesK = verial.nextDouble();
     System.out.print(" Armut Kaç Kilo : ");
     armutK = verial.nextDouble();
     System.out.print(" Armut Kaç Kilo : ");
     muzK = verial.nextDouble();
     System.out.print(" Armut Kaç Kilo :");
     patlicanK = verial.nextDouble();
     toplam=(elma*elmaK)+(armut*armutK)+(patlican*patlicanK)+(domates*domatesK);
     System.out.println( "Toplam Tutar"+toplam);
 }
}
