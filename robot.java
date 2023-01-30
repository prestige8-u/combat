import java.util.Random;

public class Fighter extends Robot {
    boolean seed;

    public Fighter(String nom) {
        super(nom);
        this.nom = nom;
    }

    @Override
    public void getNom(){
        System.out.println("Fighter "+nom);
    }

    public void etatPDV(){
        System.out.println("Vie restante : " +this.nbpdv);
    }

     public void truefire(Fighter fghtr){
       Random rndm = new Random();
        if (!rndm.nextBoolean()){
            getNom();
            etatPDV();
            System.out.println("a tiré et raté sa cible\n");
        }else{
            fghtr.nbpdv = fghtr.nbpdv - 2;
            getNom();
            etatPDV();
            System.out.println("a tiré sur ");
            fghtr.getNom();
            System.out.println("");
        }

    }
}
