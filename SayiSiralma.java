import java.util.Scanner;
public class SayiSiralma {
    public static void main(String [] args){
        int enb,ort,enk;
        Scanner verial=new Scanner(System.in);
        System.out.print("Sıralanacak birinci sayıyı girniz "); int a=verial.nextInt();
        System.out.print("Sıralanacak birinci sayıyı girniz "); int b=verial.nextInt();
        System.out.print("Sıralanacak birinci sayıyı girniz "); int c=verial.nextInt();

        if ((a>b)&&(a>c)){
            System.out.println("Girilen sayıalrın içinde enbüyük sayı  " +a +" dır "); enb=a;
            if (b>c) {System.out.println("Girilen sayıalrın içinde 2. enbüyük sayı  " +b +" dır ");ort=b;
                System.out.println("Girilen sayıalrın içinde enküçük sayı  " +c +" dır ");enk=c;}
            else {System.out.println("Girilen sayıalrın içinde 2. enbüyük sayı  " + c +" dır ");ort=c;
                  System.out.println("Girilen sayıalrın içinde enküçük sayı  " + b  +" dır ");enk=b;}}
        else if ((b>a)&&(b>c)) {System.out.println("Girilen sayıalrın içinde enbüyük sayı  " +b +" dır ");enb=b;
            if (a>c) { System.out.print("Girilen sayıalrın içinde 2. enbüyük sayı  " +a +" dır ");ort=a;
            System.out.println("Girilen sayıalrın içinde enküçük sayı  " +c +" dır ");enk=c;}
            else System.out.println("Girilen sayıalrın içinde 2. enbüyük sayı  " + c +" dır "); ort=c;
            System.out.println("Girilen sayıalrın içinde enküçük sayı  " + a  +" dır ");enk=a;}

        else if ((c>a)&&(c>b)){
            System.out.println("Girilen sayıalrın içinde enbüyük sayı  " +c +" dır ");enb=c;
            if (a>b) { System.out.println("Girilen sayıalrın içinde 2. enbüyük sayı  " +a +" dır "); ort=a;
            System.out.println("Girilen sayıalrın içinde enküçük sayı  " + b +" dır ");enk=b;}
            else{ System.out.println("Girilen sayıalrın içinde 2. enbüyük sayı  " + b +" dır ");ort=b;
            System.out.println("Girilen sayıalrın içinde enküçük sayı  " + a  +" dır ");enk=a;}}

        //System.out.println(" Sayıların sıralması   " + enb+ ">" + ort +">" + enk +" dır ");
    }
}
