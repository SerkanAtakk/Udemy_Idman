import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman Programına Hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler...\n"
                          + "Burpee\n"
                          + "Pushup\n"
                          + "Situp\n"
                          + "Squat\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee Sayısı : ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayısı : ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayısı : ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayısı : ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("İdmanınız Başlıyor.....");

        while (!idman.idmanBittiMi()) {
            System.out.print("Hareket Türü(Burpee, Pushup, Situp, Squat, Çıkış q) : ");
            String tur = scanner.nextLine();
            if (tur.equalsIgnoreCase("q")) {
                System.out.println("Çıkılıyor...");
                break;
            }
            System.out.println("Bu hareketten kaç tane yapacaksınız ? ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
        }
        if (idman.idmanBittiMi()) {
            System.out.println("İdmanınız bitti tebrik ederim");
        }
        else {
            idman.kalanIdman();
        }
    }
}