import java.util.Scanner;
public class SifreSorgu {
    public static void main (String[] args) {
        String sifre,kullanici;
        Scanner verial = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı Giriniz");
         kullanici= verial.nextLine();
        System.out.println("Şifrenizi Giriniz");
         sifre= verial.nextLine();
        if (kullanici.equals("patika")&& sifre.equals("java123")) {
            System.out.print(" Tebrikler Şifreniz Doğru ");}
        else System.out.print(" Üzgünüz Girmişolduğunuz şifre yanlışltır ");
        }
        }
