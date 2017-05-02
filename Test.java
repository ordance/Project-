/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

abstract class Artikli {
    
    private String ime;
    private int kolicina;
    private double poccena;
    private double procena;
    private int sifra;
    
    public Artikli(String ime, int kolicina, double poccena, double procena, int sifra) {
        this.ime = ime;
        this.kolicina = kolicina;
        this.poccena = poccena;
        this.procena = procena;
        this.sifra = sifra;
    }
    
    public abstract double presmetajnabCena();
    
    public abstract double presmetajProdCena();
    
    public abstract double presmetajPrihod();
    
    @Override
    public String toString() {
        String s;
        s = "Ime:" + this.getIme() + "\t";
        s += "Kolicina:" + this.getKolicina() + "\t";
        s += "Nabavna cena:" + this.getPoccena() + "\t";
        s += "Prodazna cena:" + this.getProcena() + "\t";
        s += "Sifra:" + this.getSifra() + "\t";
        return s;
    }
    
    public void prikaziPodatoci() {
        System.out.println(this.toString());
    }
    
    public String getIme() {
        return ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }
    
    public int getKolicina() {
        return kolicina;
    }
    
    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
    
    public double getPoccena() {
        return poccena;
    }
    
    public void setPoccena(double poccena) {
        this.poccena = poccena;
    }
    
    public double getProcena() {
        return procena;
    }
    
    public void setProcena(double procena) {
        this.procena = procena;
    }
    
    public int getSifra() {
        return sifra;
    }
    
    public void setSifra(int sifra) {
        this.sifra = sifra;
    }
}

abstract class Prehrana extends Artikli {
    
    public Prehrana(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
}

class Leb extends Prehrana {
    
    public Leb(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class Ovosje extends Prehrana {
    
    public Ovosje(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class Salama extends Prehrana {
    
    public Salama(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class Kolbasi extends Prehrana {
    
    public Kolbasi(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class Slanina extends Prehrana {
    
    public Slanina(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class Kremenadli extends Prehrana {
    
    public Kremenadli(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class MesniProizvodi extends Prehrana {
    
    public MesniProizvodi(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class OstanataPrehrana extends Prehrana {
    
    public OstanataPrehrana(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

class Zelencuk extends Prehrana {
    
    public Zelencuk(String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
}

abstract class BezalhoholniPijaloci extends Artikli {
    
    private double tezina;
    
    public BezalhoholniPijaloci(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
        this.tezina = tezina;
    }
    
    abstract double presmetajTezina();
    
    public double getTezina() {
        return tezina;
    }
    
    public void setTezina(double tezina) {
        this.tezina = tezina;
    }
    
    @Override
    public String toString() {
        String s;
        s = super.toString();
        s += "\tTezina na edno sise:" + this.getTezina() + "\t";
        return s;
    }
    
    @Override
    public void prikaziPodatoci() {
        System.out.println(this.toString());
    }
}

class Sokovi extends BezalhoholniPijaloci {
    
    public Sokovi(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

class SokoviZaRast extends BezalhoholniPijaloci {
    
    public SokoviZaRast(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

class MineralnaVoda extends BezalhoholniPijaloci {
    
    public MineralnaVoda(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

class Limonadi extends BezalhoholniPijaloci {
    
    public Limonadi(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

abstract class AlhoholniPijaloci extends Artikli {
    
    private double tezina;
    
    public AlhoholniPijaloci(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(ime, kolicina, poccena, procena, sifra);
        this.tezina = tezina;
    }
    
    abstract double presmetajTezina();
    
    public double getTezina() {
        return tezina;
    }
    
    public void setTezina(double tezina) {
        this.tezina = tezina;
    }
    
    @Override
    public String toString() {
        String s;
        s = super.toString();
        s += "\tTezina na edno sise:" + this.getTezina() + "\t";
        return s;
    }
    
    @Override
    public void prikaziPodatoci() {
        System.out.println(this.toString());
    }
}

class Piva extends AlhoholniPijaloci {
    
    public Piva(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

class Vina extends AlhoholniPijaloci {
    
    public Vina(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

class Zestoki extends AlhoholniPijaloci {
    
    public Zestoki(double tezina, String ime, int kolicina, double poccena, double procena, int sifra) {
        super(tezina, ime, kolicina, poccena, procena, sifra);
    }
    
    @Override
    public double presmetajnabCena() {
        return this.getKolicina() * this.getPoccena();
    }
    
    @Override
    public double presmetajProdCena() {
        return this.getKolicina() * this.getProcena();
    }
    
    @Override
    public double presmetajPrihod() {
        return this.presmetajProdCena() - this.presmetajnabCena();
    }
    
    @Override
    public double presmetajTezina() {
        return this.getTezina() * this.getKolicina();
    }
}

/**
 *
 * @author Administrator
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Leb[] le = new Leb[20];
        Ovosje[] ov = new Ovosje[20];
        Salama[] sal = new Salama[20];
        Kolbasi[] kolb = new Kolbasi[20];
        Slanina[] sla = new Slanina[20];
        Kremenadli[] kre = new Kremenadli[20];
        MesniProizvodi[] mespr = new MesniProizvodi[20];
        Zelencuk[] zel = new Zelencuk[20];
        OstanataPrehrana[] ospr = new OstanataPrehrana[20];
        Piva[] piv = new Piva[20];
        Vina[] vin = new Vina[20];
        Zestoki[] ze = new Zestoki[20];
        Sokovi[] sok = new Sokovi[20];
        SokoviZaRast[] skras = new SokoviZaRast[20];
        MineralnaVoda[] minvod = new MineralnaVoda[20];
        Limonadi[] lim = new Limonadi[20];
        int leb = 0, ovo = 0, sa = 0, ko = 0, sl = 0, krem = 0, mespro = 0, zele = 0, ostpr = 0;
        int pi = 0, vi = 0, zes = 0;
        int so = 0, soz = 0, min = 0, li = 0;
        BezalhoholniPijaloci bezp[];
        bezp = new BezalhoholniPijaloci[20];
        AlhoholniPijaloci alh[];
        alh = new AlhoholniPijaloci[20];
        int izbor;
        do {
            System.out.println("1.Dodavanje na Artikli");
            System.out.println("2.Prikaz na artikli");
            System.out.println("3.Azuriranje na artikli");
            System.out.println("4.Presmetka na prihodi i rashodi");
            System.out.println("5.Izlez");
            izbor = input.nextInt();
            switch (izbor) {
                case 1: {
                    int izbor1;
                    System.out.println("1.Dodavanje na prehrana");
                    System.out.println("2.Dodavanje na alhoholni pijaloci");
                    System.out.println("3.Dodavanje na bezalhoholni pijaloci");
                    izbor1 = input.nextInt();
                    switch (izbor1) {
                        case 1: {
                            System.out.println("1.Leb");
                            System.out.println("2.Ovosje");
                            System.out.println("3.Kolbasi");
                            System.out.println("4.Salama");
                            System.out.println("5.Mesniproizvodi");
                            System.out.println("6.Zelencuk");
                            System.out.println("7.Ostanata Prehrana");
                            int izbor2;
                            izbor2 = input.nextInt();
                            switch (izbor2) {
                                case 1: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < leb; i++) {
                                            
                                            if (le[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na lebot:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na lebovi:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavnata cena na lebot:\t");
                                    double nabcena = input.nextInt();
                                    System.out.printf("Vnesete ja prodaznata cena na lebot:\t");
                                    double prodcena = input.nextInt();
                                    le[leb++] = new Leb(imel, kol, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 2: {
                                    int sifra;
                                    boolean ima;
                                    System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                    sifra = input.nextInt();
                                    do {
                                        ima = false;
                                        for (int i = 0; i < ovo; i++) {
                                            if (ov[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesnata sifra vejke postoi");
                                            }
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na ovosjeto:\t");
                                    String ime = in.nextLine();
                                    System.out.printf("Vneste ja kolicinat na ovosjeto:\t");
                                    int koli = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena:\t");
                                    double nabcena = input.nextInt();
                                    System.out.printf("Vnesete ja prodaznata cena:\t");
                                    double prodcena = input.nextInt();
                                    ov[ovo++] = new Ovosje(ime, koli, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 3: {
                                    int sifra;
                                    boolean ima;
                                    System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                    sifra = input.nextInt();
                                    do {
                                        ima = false;
                                        for (int i = 0; i < sa; i++) {
                                            if (sal[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesnata sifra vejke postoi");
                                            }
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na salamata:\t");
                                    String ime = in.nextLine();
                                    System.out.printf("Vneste ja kolicinat na salamata:\t");
                                    int koli = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena:\t");
                                    double nabcena = input.nextInt();
                                    System.out.printf("Vnesete ja prodaznata cena:\t");
                                    double prodcena = input.nextInt();
                                    sal[sa++] = new Salama(ime, koli, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 4: {
                                    int sifra;
                                    boolean ima;
                                    System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                    sifra = input.nextInt();
                                    do {
                                        ima = false;
                                        for (int i = 0; i < ko; i++) {
                                            if (kolb[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesnata sifra vejke postoi");
                                            }
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na kolbasite:\t");
                                    String ime = in.nextLine();
                                    System.out.printf("Vneste ja kolicinata na kolbasite:\t");
                                    int koli = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena:\t");
                                    double nabcena = input.nextInt();
                                    System.out.printf("Vnesete ja prodaznata cena:\t");
                                    double prodcena = input.nextInt();
                                    kolb[ko++] = new Kolbasi(ime, koli, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 5: {
                                    System.out.println("1.Slanina");
                                    System.out.println("2.Kremenadli");//dodavanje na meni
                                    int izbor3 = input.nextInt();
                                    switch (izbor3) {
                                        case 1: {
                                            int sifra;
                                            boolean ima;
                                            System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                            sifra = input.nextInt();
                                            do {
                                                ima = false;
                                                for (int i = 0; i < sl; i++) {
                                                    if (sla[i].getSifra() == sifra) {
                                                        ima = true;
                                                        System.out.println("Vnesnata sifra vejke postoi");
                                                    }
                                                }
                                            } while (ima);
                                            java.util.Scanner in = new java.util.Scanner(System.in);
                                            System.out.printf("Vnesete go imeto na slaninata:\t");
                                            String ime = in.nextLine();
                                            System.out.printf("Vneste ja kolicinat na slaninata:\t");
                                            int koli = input.nextInt();
                                            System.out.printf("Vnesete ja nabavanta cena:\t");
                                            double nabcena = input.nextInt();
                                            System.out.printf("Vnesete ja prodaznata cena:\t");
                                            double prodcena = input.nextInt();
                                            sla[sl++] = new Slanina(ime, koli, nabcena, prodcena, sifra);
                                            break;
                                        }
                                        case 2: {
                                            int sifra;
                                            boolean ima;
                                            System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                            sifra = input.nextInt();
                                            do {
                                                ima = false;
                                                for (int i = 0; i < krem; i++) {
                                                    if (kre[i].getSifra() == sifra) {
                                                        ima = true;
                                                        System.out.println("Vnesnata sifra vejke postoi");
                                                    }
                                                }
                                            } while (ima);
                                            java.util.Scanner in = new java.util.Scanner(System.in);
                                            System.out.printf("Vnesete go imeto na kremenadlite:\t");
                                            String ime = in.nextLine();
                                            System.out.printf("Vneste ja kolicinata na kremenadlite:\t");
                                            int koli = input.nextInt();
                                            System.out.printf("Vnesete ja nabavanta cena:\t");
                                            double nabcena = input.nextInt();
                                            System.out.printf("Vnesete ja prodaznata cena:\t");
                                            double prodcena = input.nextInt();
                                            kre[krem++] = new Kremenadli(ime, koli, nabcena, prodcena, sifra);
                                            break;
                                        }
                                    }
                                    break;
                                }
                                case 6: {
                                    int sifra;
                                    boolean ima;
                                    System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                    sifra = input.nextInt();
                                    do {
                                        ima = false;
                                        for (int i = 0; i < zele; i++) {
                                            if (zel[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesnata sifra vejke postoi");
                                            }
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na zelencukot:\t");
                                    String ime = in.nextLine();
                                    System.out.printf("Vneste ja kolicinata na zelencukot:\t");
                                    int koli = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena:\t");
                                    double nabcena = input.nextInt();
                                    System.out.printf("Vnesete ja prodaznata cena:\t");
                                    double prodcena = input.nextInt();
                                    zel[zele++] = new Zelencuk(ime, koli, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 7: {
                                    int sifra;
                                    boolean ima;
                                    System.out.printf("Vnesete ja sifrata na artikolt:\t");
                                    sifra = input.nextInt();
                                    do {
                                        ima = false;
                                        for (int i = 0; i < ostpr; i++) {
                                            if (ospr[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesnata sifra vejke postoi");
                                            }
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na prozvodot:\t");
                                    String ime = in.nextLine();
                                    System.out.printf("Vneste ja kolicinata na prozivodot:\t");
                                    int koli = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena:\t");
                                    double nabcena = input.nextInt();
                                    System.out.printf("Vnesete ja prodaznata cena:\t");
                                    double prodcena = input.nextInt();
                                    ospr[ostpr++] = new OstanataPrehrana(ime, koli, nabcena, prodcena, sifra);
                                    break;
                                }
                            }
                            break;
                        }
                        
                        case 2: {
                            System.out.println("1.Pivo");
                            System.out.println("2.Vino");
                            System.out.println("3.Zestoki pijaloci");
                            int izbor2;
                            izbor2 = input.nextInt();
                            switch (izbor2) {
                                case 1: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < pi; i++) {
                                            
                                            if (piv[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na pivoto:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na piva:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavnata cena na pivoto:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na pivoto:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno pivo:\t");
                                    double tezina = input.nextFloat();
                                    piv[pi++] = new Piva(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 2: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < vi; i++) {
                                            
                                            if (vin[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na vinoto:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na vina:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavnata cena na vinoto:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na vinoto:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno vino:\t");
                                    double tezina = input.nextDouble();
                                    vin[vi++] = new Vina(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 3: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < zes; i++) {
                                            
                                            if (ze[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na pijalokot:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na pijaloci:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena na pijalokot:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na pijalokot:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno sise:\t");
                                    double tezina = input.nextDouble();
                                    ze[zes++] = new Zestoki(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                    
                                }
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("1.Sokovi");
                            System.out.println("2.Sokovi za rastvorane");
                            System.out.println("3.Mineralna voda");
                            System.out.println("4.Limonadi");
                            int izbor2;
                            izbor2 = input.nextInt();
                            switch (izbor2) {
                                case 1: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < so; i++) {
                                            
                                            if (sok[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na sokot:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na sokovi:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavnata cena na sokot:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na sokot:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno sise sok:\t");
                                    double tezina = input.nextDouble();
                                    sok[so++] = new Sokovi(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 2: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < soz; i++) {
                                            
                                            if (skras[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na sokot:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na sokovi:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavnata cena na sokot:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na sokot:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno sise sok:\t");
                                    double tezina = input.nextDouble();
                                    skras[soz++] = new SokoviZaRast(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                }
                                case 3: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < min; i++) {
                                            
                                            if (minvod[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na vodata:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na sisina voda:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena na vodata:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na vodata:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno sise:\t");
                                    double tezina = input.nextDouble();
                                    minvod[min++] = new MineralnaVoda(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                    
                                }
                                case 4: {
                                    int sifra;
                                    boolean ima;
                                    do {
                                        ima = false;
                                        System.out.printf("Vnesete sifra na artiklot:\t");
                                        sifra = input.nextInt();
                                        for (int i = 0; i < li; i++) {
                                            
                                            if (lim[i].getSifra() == sifra) {
                                                ima = true;
                                                System.out.println("Vnesenata sifra vejke postoi");
                                            }
                                            
                                        }
                                    } while (ima);
                                    java.util.Scanner in = new java.util.Scanner(System.in);
                                    System.out.printf("Vnesete go imeto na limonadata:\t");
                                    String imel = in.nextLine();
                                    System.out.printf("Vnesete go brojot na sisina limonada:\t");
                                    int kol = input.nextInt();
                                    System.out.printf("Vnesete ja nabavanta cena na limonadata:\t");
                                    double nabcena = input.nextDouble();
                                    System.out.printf("Vnesete ja prodaznata cena na limonadata:\t");
                                    double prodcena = input.nextDouble();
                                    System.out.printf("Vnesete ja tezinata na edno sise:\t");
                                    double tezina = input.nextDouble();
                                    lim[li++] = new Limonadi(tezina, imel, kol, nabcena, prodcena, sifra);
                                    break;
                                    
                                }
                            }
                            break;
                        }
                    }//Zatvorane na switch(izbor1)
                    break;
                }//zavrsuvane na case1 od meni pod opcija 1
                case 2: {
                    System.out.println("1.Prikazi gi site artikli");
                    System.out.println("2.Poseben prikaz na artikli");
                    int iz = input.nextInt();
                    
                    switch (iz) {
                        case 1: {
                            System.out.println("Prikaz na lebovi:");
                            for (int i = 0; i < leb; i++) {
                                
                                le[i].prikaziPodatoci();
                                
                            }
                            System.out.println("Prikaz na ovosja:");
                            for (int i = 0; i < ovo; i++) {
                                ov[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na salami:");
                            for (int i = 0; i < sa; i++) {
                                sal[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na kolbasi:");
                            for (int i = 0; i < ko; i++) {
                                kolb[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na slanina");
                            for (int i = 0; i < sl; i++) {
                                sla[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na kremenadli:");
                            for (int i = 0; i < krem; i++) {
                                kre[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na mesni proizvodi:");
                            for (int i = 0; i < mespro; i++) {
                                mespr[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na zelencuk");
                            for (int i = 0; i < zele; i++) {
                                zel[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na ostanta prehrana:");
                            for (int i = 0; i < ostpr; i++) {
                                ospr[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na piva:");
                            for (int i = 0; i < pi; i++) {
                                piv[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na vina:");
                            for (int i = 0; i < vi; i++) {
                                vin[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na zestoki pijaloci :");
                            for (int i = 0; i < zes; i++) {
                                ze[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na sokovi:");
                            for (int i = 0; i < so; i++) {
                                sok[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na sokovi za rastvoranje  :");
                            for (int i = 0; i < soz; i++) {
                                skras[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na mineralni vodi:");
                            for (int i = 0; i < min; i++) {
                                minvod[i].prikaziPodatoci();
                            }
                            System.out.println("Prikaz na limonadi:");
                            for (int i = 0; i < li; i++) {
                                lim[i].prikaziPodatoci();
                                
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("1.Prikaz na prehrambeni proizvodi");
                            System.out.println("2.Prikaz na alhoholni pijaloci");
                            System.out.println("3.Prikaz na bezalhoholni pijaloci");
                            int izb = input.nextInt();
                            switch (izb) {
                                case 1: {
                                    System.out.println("Prikaz na lebovi:");
                                    for (int i = 0; i < leb; i++) {
                                        
                                        le[i].prikaziPodatoci();
                                        
                                    }
                                    System.out.println("Prikaz na ovosja:");
                                    for (int i = 0; i < ovo; i++) {
                                        ov[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na salami:");
                                    for (int i = 0; i < sa; i++) {
                                        sal[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na kolbasi:");
                                    for (int i = 0; i < ko; i++) {
                                        kolb[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na slanina");
                                    for (int i = 0; i < sl; i++) {
                                        sla[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na kremenadli:");
                                    for (int i = 0; i < krem; i++) {
                                        kre[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na mesni proizvodi:");
                                    for (int i = 0; i < mespro; i++) {
                                        mespr[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na zelencuk");
                                    for (int i = 0; i < zele; i++) {
                                        zel[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na ostanta prehrana:");
                                    for (int i = 0; i < ostpr; i++) {
                                        ospr[i].prikaziPodatoci();
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.println("Prikaz na piva:");
                                    for (int i = 0; i < pi; i++) {
                                        piv[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na vina:");
                                    for (int i = 0; i < vi; i++) {
                                        vin[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na zestoki pijaloci :");
                                    for (int i = 0; i < zes; i++) {
                                        ze[i].prikaziPodatoci();
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.println("Prikaz na sokovi:");
                                    for (int i = 0; i < so; i++) {
                                        sok[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na sokovi za rastvoranje  :");
                                    for (int i = 0; i < soz; i++) {
                                        skras[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na mineralni vodi:");
                                    for (int i = 0; i < min; i++) {
                                        minvod[i].prikaziPodatoci();
                                    }
                                    System.out.println("Prikaz na limonadi:");
                                    for (int i = 0; i < li; i++) {
                                        lim[i].prikaziPodatoci();
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } while (izbor != 5);
        
        
    }

    private Test() {
    }
}
