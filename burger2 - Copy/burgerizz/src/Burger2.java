public class Burger2 {
private int skaits;
private double summa;
private String burger;
private String komplekts;
private String souce;
private String name;
    public Burger2(String burger,String komplekts,String souce,int skaits,double summa,String name){
        this.skaits=skaits;
        this.summa = summa;
        this.burger =burger;
        this.komplekts=komplekts;
        this.souce=souce;
        this.name=name;

    }

    public double Sum1(){
        if (burger == "Siera Burgers") {
            summa = summa + (1.5*skaits);
        }else if (burger=="Dubultais Siera Burgers"){
            summa = summa +(2.5*skaits);
        }else if (burger=="Bekona burgers"){
            summa = summa +(4*skaits);
        }else if (burger=="Rizz burgers"){
            summa = summa +(5*skaits);
        }else if (burger=="Kebaba burgers"){
            summa = summa +(4.5*skaits);
        }
        if (komplekts=="Mazais komplekts"){
            summa = summa+(1*skaits);
        }else if (komplekts=="Lielais komplekts"){
            summa = summa +(2*skaits);
        }else if (komplekts=="Bez kompletka"){
            summa = summa +0;
        }
        if (souce=="Bez mērces"){
            summa=summa+0;
        }else {
            summa=summa+0.7;
        }
        return summa;
    }

    public String printinfo(){
       return "\n"+"Paldies par Jūsu pasūtījumu "+name+"!"+"\n"+"Jūsu pasūtījums ir: "+skaits+" "+burger+", "+komplekts+" un "+souce+"."+"\n"+"Jūsu pasūtījuma summa ir: "+summa+" eiro.";


    }

    public int getSkaits() {
        return skaits;
    }

    public void setSkaits(int skaits) {
        this.skaits = skaits;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getKomplekts() {
        return komplekts;
    }

    public void setKomplekts(String komplekts) {
        this.komplekts = komplekts;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }
}
