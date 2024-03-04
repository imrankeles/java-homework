//İMRAN KELEŞ
//BİLGİSAYAR MÜHENDİSLİĞİ 1.SINIF
//Öğ.NO- 2023123058
//ÖDEV
public class Main {
    public static void main(String[] args) {
        String[] katilimcilar = {"Kadir", "Gökhan", "Hakan", "Suzan","Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin","Deniz", "Gözde", "Anıl", "Burak",};
        int[] dereceler = {341, 273, 278, 329, 445, 402, 388, 270,243,334, 412, 393, 299, 343, 317, 265};
        System.out.println("Birinci: " + Metotlar.birincilik(katilimcilar,dereceler) + " dakika " );
        System.out.println("İkinci: " + Metotlar.ikincilik(katilimcilar,dereceler) + " dakika ");
        System.out.println("Üçüncü: " + Metotlar.ucunculuk(katilimcilar,dereceler) + " dakika ");
        System.out.println(Metotlar.harfPuanlari(dereceler));


    }



}