public class Metotlar {
    public static String birincilik (String[] isimler, int[] dereceler){
        int temp = 0;
        String temp_name;
        for (int i = 0; i < dereceler.length - 1; i++) {
            for (int j = i + 1; j < dereceler.length; j++) {
                if (dereceler[i] > dereceler[j]) {
                    temp_name = isimler[i];
                    isimler[i] = isimler[j];
                    isimler[j] = temp_name;
                    temp = dereceler[i];
                    dereceler[i] = dereceler[j];
                    dereceler[j] = temp;
                }
            }
        }
        return
                isimler[0] + " " + dereceler[0];
    }
    public static String ikincilik (String[] isimler, int[] dereceler){
        birincilik(isimler, dereceler);
        return isimler[1] + " " + dereceler[1];
    }
    public static String ucunculuk (String[] isimler, int[] dereceler){
        ikincilik(isimler, dereceler);
        return isimler[2] + " " + dereceler[2];
    }
    public static String harfPuanlari(int[] dereceler) {
        int dereceA = 0, dereceB = 0, dereceC = 0;
        for (int i = 0; i < dereceler.length; i++) {
            if (200 <= dereceler[i] && dereceler[i] <= 299)
                dereceA++;
            if (300 <= dereceler[i] && dereceler[i] <= 399)
                dereceB++;
            if (400 <= dereceler[i])
                dereceC++;
        }
        String sonuc = "A->"+dereceA +" B->"+dereceB +" C->"+ dereceC;
    return sonuc;
    }
}


