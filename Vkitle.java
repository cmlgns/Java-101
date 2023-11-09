import java.util.Scanner;
public class Vkitle {
    public static void main (String [] args){
        Double kilo,boy,kendex;
        Scanner verial=new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : ");
        kilo=verial.nextDouble();
        System.out.print("Boyunuzu Giriniz : ");
        boy=verial.nextDouble();
        kendex= kilo/boy*boy;
        System.out.println("Vucut Kitle Endexiniz:"+kendex );
    }
}
