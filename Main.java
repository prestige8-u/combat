import java.util.Random;
class Robot{
    String nom;
    int nbpdv = 10;

    public Robot(String nom){
        this.nom = nom;
    }

    public void getNom(){
        System.out.println("Robot "+nom);
    }

    public void fire(Robot rbt){
        rbt.nbpdv = rbt.nbpdv - 2;
        getNom();
        System.out.println(" à tiré sur ");
        rbt.getNom();
        System.out.println("");

    }

    public boolean isDead(){
        if (this.nbpdv>0){
            return false;
        }else{
            return true;
        }
    }


}

class Arena{
    public void fight(Robot rb1, Robot rb2){

        do{
            rb1.fire(rb2);
            if (!rb2.isDead()){
                rb2.fire(rb1);
            }
        }while(!rb2.isDead());

        if (rb2.isDead()){
            System.out.println("Le vainqueur est : ");
            rb1.getNom();
        }else{
            System.out.println("Le vainqueur est : ");
            rb2.getNom();
        }
    }


    public void truefight(Fighter f1, Fighter f2){
        do{
            f1.truefire(f2);
            if (!f2.isDead()){
                f2.truefire(f1);
            }
        }while(!f2.isDead() && !f1.isDead());

        if (f2.isDead()){
            System.out.println("Le vainqueur est : ");
            f1.getNom();
        }else if (f1.isDead()){
            System.out.println("Le vainqueur est : ");
            f2.getNom();
        }


    }


}

public class Main {
    public static void main(String[] args) {
        Fighter D2R2 = new Fighter("D2R2");
        Fighter Data = new Fighter("Data");
        Arena starwars = new Arena();
        starwars.truefight(D2R2, Data);
    }
}