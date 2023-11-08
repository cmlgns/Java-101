
import java.util.Scanner;
public class KdvHes {
public static void main (String [] args ){
    Double fyt,kdv,toptutar;
    Scanner verial=new Scanner(System.in);
    System.out.print("Ürünün Kdvsiz Fiyatını giriniz:");
    fyt=verial.nextDouble();
    if (fyt >1000) kdv=fyt *(0.20);
    else kdv =fyt *(0.1);
toptutar=fyt+kdv;
System.out.print("Ürünün fiyatı :"+ fyt);
System.out.print("Ürünün Kdv si :"+ kdv);
System.out.print("Ürünün Kdvli Fiyatı :"+ toptutar);




    }


}
