public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int b_s, int p_s, int si_s, int sq_s) {
        this.burpee_sayisi = b_s;
        this.pushup_sayisi = p_s;
        this.situp_sayisi = si_s;
        this.squat_sayisi = sq_s;
    }
//
    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }
    public void setBurpee_sayisi(int b_s) {
        burpee_sayisi = b_s;
    }
//
    public int getPushup_sayisi() {
        return pushup_sayisi;
    }
    public void setPushup_sayisi(int p_s) {
        pushup_sayisi = p_s;
    }
//
    public int getSitup_sayisi() {
        return situp_sayisi;
    }
    public void setSitup_sayisi(int si_s) {
        situp_sayisi = si_s;
    }
//
    public int getSquat_sayisi() {
        return squat_sayisi;
    }
    public void setSquat_sayisi(int sq_s) {
        squat_sayisi = sq_s;
    }
//
    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equalsIgnoreCase("Burpee")) {
            burpeeYap(sayi);
        }
        else if (hareketTuru.equalsIgnoreCase("Pushup")) {
            pushupYap(sayi);
        }
        else if (hareketTuru.equalsIgnoreCase("Situp")) {
            situpYap(sayi);
        }
        else if (hareketTuru.equalsIgnoreCase("Squat")) {
            squatYap(sayi);
        }
        else {
            System.out.println("Geçersiz Hareket...");
        }
    }
//
    public void burpeeYap(int sayi) {
        if (burpee_sayisi == 0) {
            System.out.println("Yapacak burpee kalmadı...");
        } else if (burpee_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin.");
            burpee_sayisi = 0;
        } else {
            burpee_sayisi -= sayi;
        }
        System.out.println("Kalan burpee : " + burpee_sayisi);
    }
//

    public void pushupYap(int sayi) {
        if (pushup_sayisi == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        } else if (pushup_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin.");
            pushup_sayisi = 0;
        } else {
            pushup_sayisi -= sayi;
        }
        System.out.println("Kalan pushup : " + pushup_sayisi);
    }
//
    public void situpYap(int sayi) {
        if (situp_sayisi == 0) {
            System.out.println("Yapacak situp kalmadı...");
        } else if (situp_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin.");
            situp_sayisi = 0;
        } else {
            situp_sayisi -= sayi;
        }
        System.out.println("Kalan situp : " + situp_sayisi);
    }
//
    public void squatYap(int sayi) {
        if (squat_sayisi == 0) {
            System.out.println("Yapacak squat kalmadı...");
        } else if (squat_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin.");
            squat_sayisi = 0;
        } else {
            squat_sayisi -= sayi;
        }
        System.out.println("Kalan squat : " + squat_sayisi);
    }
//
    public boolean idmanBittiMi() {
        return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
    public void kalanIdman () {
        System.out.println("Kalan burpee sayisi " + burpee_sayisi );
        System.out.println("Kalan pushup sayisi " + pushup_sayisi );
        System.out.println("Kalan situp sayisi " + situp_sayisi );
        System.out.println("Kalan squat sayisi " + squat_sayisi );
    }
}

