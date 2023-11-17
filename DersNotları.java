import java.util.Scanner;
public class DersNotları {
    public static void main(String[] args) {
        int M, F, T, K, Z,tp=0;
        Scanner verial = new Scanner(System.in);
        System.out.print("Matemetik notunu giriniz");
        M = verial.nextInt();if ((M >0) & ( M < 100 )) { tp=M+tp;} else System.out.println("girdiğiniz not 0 ile 100 arasında değildir ");
        System.out.print(" Fizik Ders notunu giriniz");
        F = verial.nextInt();if ((F >0) & ( F < 100 )) { tp=F+tp;} else System.out.println("girdiğiniz not 0 ile 100 arasında değildir ");
        System.out.print("Türkçe dersi notunu giriniz");
        T = verial.nextInt();if ((T >0) & ( T < 100 )) { tp=T+tp;} else System.out.println("girdiğiniz not 0 ile 100 arasında değildir ");
        System.out.print("Kimya Ders notunu giriniz");
        K = verial.nextInt();if ((K >0) & ( K < 100 )) { tp=K+tp;} else System.out.println("girdiğiniz not 0 ile 100 arasında değildir ");
        System.out.print("Muzik ders notunu giriniz");
        Z = verial.nextInt();if ((Z>0) & ( Z < 100 )) { tp=Z+tp;} else System.out.println("girdiğiniz not 0 ile 100 arasında değildir ");
        System.out.println(" Girdiğiniz Notların Ortlmanız \t" + (tp/5) +"\t");
        if ((tp/5) >= 55) System.out.print("Ortalmanız "+tp/5 + " Tebirkler sınıfı geçtiniz");
        else  System.out.println(" Üzgünüm notunuz \t"+ tp/5 +"  sınıf geçebilmeniz için yeterli değildir");

       // { & (((M)&(F)&(T)&(K)&(Mu)) >0) }
    }
}