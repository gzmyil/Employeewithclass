package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Emplooye Gizem1=new Emplooye();
        Gizem1.isim= "Gizem";
        Gizem1.soyisim="Yıldırım";
        Gizem1.yas=34;
        Gizem1.setMaas(0,500);
        Gizem1.setSabika("Sabıkalı Değildir");
        Gizem1.setPrim(5000);
        Gizem1.setTecrube(10);

        System.out.println("Çalışan ismi: "+Gizem1.isim+"\nÇalışan soyisim: "+Gizem1.soyisim+"\nÇalışan yaşı: "+Gizem1.yas+"\nÇalışan maaş: "+ Gizem1.getmaas());
        System.out.println("Çalışanın sabıka durumu: "+Gizem1.getSabika());
        System.out.println("Çalışanın primi: "+Gizem1.getPrim());
        System.out.println("Çalışanın tecrübesi: "+Gizem1.getTecrube()+" yıl dır");
        System.out.println("Şirket ismi: "+Gizem1.getSirket());

    }
}
