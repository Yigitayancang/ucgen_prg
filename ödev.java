import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = scanner.nextInt();
        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları yazdırma
            for (int j = 0; j < basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırma   
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Her satırın sonunda yeni satıra geç
        }
    }
}
