
import java.util.Scanner;
public class Taximetre {
    public static void main( String [] args) {
        Scanner verial=new Scanner(System.in);
        Double tx=2.2 , tkm , ucret;
        System.out.print("Taksi metre km sini giriniz");
        tkm=verial.nextDouble();
        ucret = (tx*tkm)+ 10;
                if (ucret < 20) System.out.println("Takismetre ücreti: 20 Tl dir ");
               else if (ucret >= 20) System.out.println("Takismetre ücreti: "+ucret);




    }

}
