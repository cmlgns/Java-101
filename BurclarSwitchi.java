import java.util.Scanner;
public class BurclarSwitchi {
    public static void main (String [] args) {
        Scanner verial = new Scanner(System.in);
        System.out.print("Doğum Gününüzü Giriniz ");
        int gun = verial.nextInt();
        System.out.print("Doğum ayınızı Giriniz ");
        int ay = verial.nextInt();
        //System.out.print("Doğum tarihimi lütfen dd/mm/yyyy formatında giriniz! ");
        //String gunay=verial.nextLine();
       // String gun1= (gunay.split("/"))[0];
        //String ay1= (gunay.split("/"))[1];
        //String yil= (gunay.split("/"))[2];

        switch (ay) {
            case 01: if (gun >= 21) System.out.print("Oğlak Burcusunuz"); else System.out.print("Kova Burcusunuz");
            break;
            case 02: if (gun >= 20) System.out.print("Kova Burcusunuz"); else System.out.print("Balık Burcusunuz");
            break;
            case 03: if (gun >= 20) System.out.print("Balık Burcusunuz"); else System.out.print("Koç Burcusunuz");
            break;
            case 04: if (gun >= 20) System.out.print("Koç Burcusunuz"); else System.out.print("Boğa Burcusunuz");
            break;
            case 05: if (gun >= 20) System.out.print("Boğa Burcusunuz"); else System.out.print("İkizler Burcusunuz");
            break;
            case 06: if (gun >= 20) System.out.print("İkizler Burcusunuz"); else System.out.print("Yengeç Burcusunuz");
            break;
            case 07: if (gun >= 20) System.out.print("Yengeç Burcusunuz"); else System.out.print("Aslan Burcusunuz");
            break;
            case 8: if (gun >= 20) System.out.print("Aslan Burcusunuz"); else System.out.print("Başak Burcusunuz");
            break;
            case 9: if (gun >= 20) System.out.print("Başak Burcusunuz"); else System.out.print("Terazi Burcusunuz");
            break;
            case 10:if (gun >= 20) System.out.print("Terazi Burcusunuz"); else System.out.print("Akrep Burcusunuz");
            break;
            case 11:if (gun >= 20) System.out.print("Akrep  Burcusunuz"); else System.out.print("Yay Burcusunuz");
            break;
            case 12:if (gun >= 21) System.out.print("Yay Burcusunuz"); else System.out.print("Oğlak Burcusunuz");
            break;
            default: System.out.print("Lütfen doğum ayınızı 01-02-03-04-05-06-07-08-09-10-11-12 seçeneklerinden birini giriniz ");
            break;
        }

    }
    }







/*import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class BurclarSwitchi {
    public static void main(String[] args){
        Scanner verial=new Scanner(System.in);
        System.out.print("Doğum Tarihinizi Girniz: ");
        //String dt=verial nextLine();
        Date dt =new Date();

        System.out.print(" Doğum Tarihniz "+ dt);
        //if (const.equalsIgnoreCase("xxxxx"))
        // Date tarih1=new Date();
    }
}*/