package Main;

import com.sun.jdi.InterfaceType;

public class Main {
    public static void main(String[] args) {

    }

}



class Prekazka{
    private String jmeno;
    private int skvira;
    private int jedovatost;
    private int svetlo;
    private int zbytkyJidla;
    private Boolean podlahaLepi;

    public Prekazka(String jmeno, int skvira, int jedovatost, int svetlo, int zbytkyJidla, Boolean podlahaLepi) {
        this.jmeno = jmeno;
        if (skvira <= 6 && skvira >= 1) {
            this.skvira = skvira;
        }
      if (jedovatost <= 100 && jedovatost >= 0) {
          this.jedovatost = jedovatost;
      }
        if (svetlo <= 100 && svetlo >= 0) {
            this.svetlo = svetlo;
        }
       if (zbytkyJidla <= 20 && zbytkyJidla >= 0) {
           this.zbytkyJidla = zbytkyJidla;
       }
        this.podlahaLepi = podlahaLepi;
    }


    @Override
    public String toString() {
        return "name" + jmeno + skvira + jedovatost + svetlo + zbytkyJidla +  podlahaLepi;
    }
}

//DedecekSvab
class DedaSvab{
    private String jmeno;
    private int energie;
    private int countPrekazky;
    private Boolean Zije;

    public DedaSvab(String jmeno, int energie, int countPrekazky, Boolean zije) {
        this.jmeno = jmeno;
        this.energie = energie;
        this.countPrekazky = countPrekazky;
        Zije = zije;
    }
}


//Maly Svab
class MalySvab extends DedaSvab implements ISvab {

    public MalySvab(String jmeno, int energie, int countPrekazky, Boolean zije) {
        super(jmeno, energie, countPrekazky, zije);
    }

    @Override
    public String getJmeno() {
        return "";
    }

    @Override
    public boolean muzeProjit(Prekazka p) {
        return false;
    }

    @Override
    public void Projdi(Prekazka p) {

    }

    @Override
    public boolean jeNazivu() {
        return false;
    }

    @Override
    public int getEnergie() {
        return 0;
    }

    @Override
    public int getPocetProjitychPrekazek() {
        return 0;
    }

    @Override
    public void vypisStav() {

    }
}

//Obrneny svab
class ObrnenySvab extends DedaSvab implements ISvab {
    public ObrnenySvab(String jmeno, int energie, int countPrekazky, Boolean zije) {)
        super(jmeno, energie, countPrekazky, zije);


    }

    @Override
    public String getJmeno() {
        return "";
    }

    @Override
    public boolean muzeProjit(Prekazka p) {
        return false;
    }

    @Override
    public void Projdi(Prekazka p) {

    }

    @Override
    public boolean jeNazivu() {
        return false;
    }

    @Override
    public int getEnergie() {
        return 0;
    }

    @Override
    public int getPocetProjitychPrekazek() {
        return 0;
    }

    @Override
    public void vypisStav() {

    }
}
