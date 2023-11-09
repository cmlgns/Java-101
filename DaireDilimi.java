import java.util.Scanner;
public class DaireDilimi {
    public static void main( String [] args){
    Double pi=3.14,alfa,r,sonuc;
    Scanner verial = new Scanner(System.in);
    System.out.print(" r yarı çapını giriniz: ");
    r=verial.nextDouble();
        System.out.print(" alfa açısını giriniz: ");
        alfa=verial.nextDouble();
        sonuc=(pi*r*r*alfa)/360 ;
        System.out.println("Daire dilimi : alanı "+sonuc);
    }
}
