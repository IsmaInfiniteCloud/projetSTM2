import java.util.Scanner;

public class MenuItemAbbonement {

    private static final String MENU = ("******************************************\n" +
            "*Bienvenue a la STM *\n" +
            "*Categories des titres de transport :              *\n" +
            "*Veuillez choisir une categorie d'achat :          *\n" +
            "******************************************         *\n" +
            "*S     Semaine                                     *\n" +
            "*M     Mois                                        *\n" +
            "*4     4 Mois                                      *\n" +
            "*Q     Quitter                                     *\n" +
            "******************************************         *\n" +
            "*Veuillez faire votre choix :                      *\n" +
            "");

    private Scanner scanner;
    private String choix ;
    private double taux;

    public MenuItemAbbonement(double taux,Scanner scanner) {
        this.taux = taux;
        this.scanner= scanner;
        this.choix = "";
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "MenuItemAbbonement{" +
                "scanner=" + scanner +
                ", choix='" + choix + '\'' +
                ", taux=" + taux +
                '}';
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public void start(){
        System.out.println("test");
    }
}
