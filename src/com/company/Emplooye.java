package com.company;

public class Emplooye implements Home{

    public String isim,soyisim;
    public int yas;
    private double maas;
    private String sabika;
    private int prim;
    private int tecrube;

    Emplooye(){

    }
    Emplooye(String isim, String soyisim, int yas, double maas, String sabika, int zam){

        this.isim=isim;
        this.soyisim=soyisim;
        this.yas=yas;
        this.getmaas();


        }
        public int getTecrube(){
        return tecrube;
        }
        public void setTecrube(int tecrube){
        this.tecrube=tecrube;
        }


        public double getmaas(){
        return (double) maas;
        }
        public void setMaas(int i, double maas){
        this.maas=maas;
        }

        public String getSabika(){
        return sabika;
        }
        public void setSabika(String sabika){
        this.sabika=sabika;
        }

        public int getPrim(){
        return prim;
        }
        public void setPrim(int prim){
        this.prim=prim;
        }


    @Override
    public String getSirket() {
        return "Koç Holding";
    }
}
    


