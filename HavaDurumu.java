import java.util.Scanner;
public class HavaDurumu {
    public static void main (String []args){
      Scanner verial =new Scanner(System.in);
      System.out.print("Hava Sıcaklıını giriniz ");
      int D =verial.nextInt();
    if ((D<=5)&(D>0)) System.out.print("Hava Soğuk Kayak yapa bilrisiniz");
    else if ((D>5)&(D<=15)) System.out.print("Bu hava tam  sinematik  ");
    else if ((D>15)&(D<=25))System.out.print("Bu hava tam piknik havası");
    else if (D<0) System.out.print("Hava Çok Soğuk evden çıkmayın ");
    else System.out.print("Hava bugün sıcak yüzme iyi bir fikir ");
    }
}
