import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        // int a,b,s;
        Scanner verial = new Scanner(System.in);
        System.out.print(" İşlem YApılacak 1. sayıyı giriniz");
        int a = verial.nextInt();
        System.out.print(" İşlem YApılacak 2. sayıyı giriniz");
        int b = verial.nextInt();
        System.out.print(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme \n Yapıalcak işlemi seçiniz: ");
       int c = verial.nextInt();
        if (c == 1) {
            int s = a + b;  System.out.print( a +" + " + b + " = "+ (a+b));
        }else if (c == 2) {
            if (a<b){ System.out.print( b +" - " + a +" =  "+(b-a));
            }else {System.out.print( a +" - " + b+ "= "+(a-b));}

        } else if (c==3) {  int s = a* b;
            System.out.print( a +" X " + b + " = " +  a*b);
        } else if (c==4) {
            if ((a >b ) & (b!=0) ) { System.out.print(a + " a/b " + b+ " = " + (a/b));}
            else if (b==0) {System.out.print(" Herhangir bir sayının sıfıra bölümü tanımsızdır");}
            else if ((b>a)& (a!=0)) {System.out.print(a + " b/a " + b +" = "+ b/a );}
            else if(a==0) {System.out.print(" Herhangir bir sayının sıfıra bölümü tanımsızdır");}
        }
       else {System.out.println("seçeneklerin dışında bir giriş yaptınız");}

    }
}