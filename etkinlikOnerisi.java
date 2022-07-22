import java.util.Scanner;

public class etkinlikOnerisi {
    public static void main(String[] args) {
        int heart;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sicakligi Giriniz :  ");
        heart = inp.nextInt();
        // Sıcaklık 5'dan küçük ise "Kayak yapma" öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" öneriliyor.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" öneriliyor.
        //Sıcaklık 25'ten büyükse "Yüzme" öneriliyor.

        if (heart < 5){
            System.out.print("Kayak yapabilirsiniz :  ");
        } else if (heart <= 15){
            System.out.print("Sinemaya gidebilirsiniz :  ");}
        else if (heart <= 25){
            System.out.print("Piknige Gidebilirsiniz  :");}
        else {
            System.out.print("Yuzmeye Gidebilirsiniz : ");
        }

    }
}
