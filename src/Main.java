import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double a,b,c,d;
        System.out.print("Matematik notunuzu giriniz :");
        a = scan.nextDouble();
        System.out.print("Fizik notunuzu giriniz : ");
        b = scan.nextDouble();
        System.out.print("Biyoloji Notunuzu giriniz :");
        c = scan.nextDouble();
        System.out.print("kimya notunuzu giriniz : ");
        d = scan.nextDouble();
        double ortalama;
        ortalama = ((a+b+c+d)/4);
        System.out.print("Ortalamanız :" + ortalama);
        if (ortalama > 50) {
            System.out.println("\n Sınıfı başarıyla geçtiniz");
        }else {
            System.out.print(" \n Düzgün çalışmanı öneriyorum");
        }
    }
}