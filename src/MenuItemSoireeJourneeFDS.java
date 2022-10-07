import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuItemSoireeJourneeFDS {


    private static final String MENU = ("******************************************\n" +
            "*Bienvenue a la STM *\n" +
            "*Categories des titres de transport :              *\n" +
            "*Veuillez choisir une categorie d'achat :          *\n" +
            "******************************************         *\n" +
            "*S     Soiree                                      *\n" +
            "*J     Journee                                     *\n" +
            "*F     Fin de semaine                              *\n" +
            "*Q     Quitter                                     *\n" +
            "******************************************         *\n" +
            "*Veuillez faire votre choix :                      *\n" +
            "");

    private ArrayList<Double> prixItem;
    private Scanner scanner;
    private String choix;

    public MenuItemSoireeJourneeFDS(double prixSoiree, double prixJournee, double prixFds,Scanner scanner ) {
        prixItem = new ArrayList<>();
        prixItem.add(prixSoiree);
        prixItem.add(prixJournee);
        prixItem.add(prixFds);
        this.prixItem = prixItem;
        this.scanner = scanner;
        this.choix = "" ;

    }

    public ArrayList<Double> getPrixItem() {
        return prixItem;
    }

    public void setPrixItem(ArrayList<Double> prixItem) {
        this.prixItem = prixItem;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    @Override
    public String toString() {
        return "MenuItemSoireeJourneeFDS{" +
                "prixItem=" + prixItem +
                ", scanner=" + scanner +
                ", choix='" + choix + '\'' +
                '}';
    }
    public void start(){
        System.out.println("this is the start menu ");
    }


}
