import java.util.ArrayList;
import java.util.Scanner;

public class App {

         public static final double TAXRATE =14.5;
    private static final String MENUDEPART = ("******************************************\n" +
            "*Bienvenue a la STM *\n" +
            "*Categories des titres de transport :              *\n" +
            "*Veuillez choisir une categorie d'achat :          *\n" +
            "******************************************         *\n" +
            "*P     Passage                                     *\n" +
            "*S     Soiree ou Journee ou Fin de semaine         *\n" +
            "*C     Abonnennement: Hebdo ou Mensuel ou 4mois    *\n" +
            "*G     Groupe                                      *\n" +
            "*A     Autre                                       *\n" +
            "*Q     Quitter                                     *\n" +
            "******************************************         *\n" +
            "*Veuillez faire votre choix :                      *\n" +
            "");

    public static void main(String[] args) {

        ArrayList<String> produitsAvecRabais = new ArrayList<>();
        ArrayList<String> invoicesList = new ArrayList<>();
        produitsAvecRabais.add("p");
        produitsAvecRabais.add("c");
        produitsAvecRabais.add("s");
        Passenger passenger = new Passenger(19, "etudiant");
        Scanner scanner = new Scanner(System.in);


        String choix = "";
        boolean aUnRabais = false;

        while (!choix.toLowerCase().equals("q")) {
            System.out.println(MENUDEPART);
            choix = scanner.nextLine();
            if (verifierSiLeProduitAUnRabais(produitsAvecRabais, choix)) {
                System.out.println("Avez vous droit a un rabais ? oui/ non ");
                String reponseRabais = scanner.nextLine();
                if (reponseRabais.equalsIgnoreCase("oui")) {
                    aUnRabais = true;
                }
            }

            switch (choix) {
                case "p": {
                    MenuItemPassage menuItemPassage = new MenuItemPassage(50.00,aUnRabais,scanner);
                    menuItemPassage.start();
                    break;
                }
                case "s": {
                    MenuItemSoireeJourneeFDS menuItemSoireeJourneeFDS = new MenuItemSoireeJourneeFDS(10,15,22,scanner);
                    menuItemSoireeJourneeFDS.start();
                    break;
                }
                case "c": {
                    MenuItemAbbonement menuItemAbbonement = new MenuItemAbbonement(12,scanner);
                    menuItemAbbonement.start();
                    break;
                }
                case "g": {
                    MenuItemGroup menuItemGroup = new MenuItemGroup(10);
                    menuItemGroup.start();
                    break;
                }
                case "a": {
                    MenuItemAutre menuItemAutre = new MenuItemAutre(10);
                    Invoice finaleInvoiceAutre =  menuItemAutre.start();

                    break;
                }
                case "q": {
                    System.out.println("Merci d'avoir choisi la STM");
                    break;
                }
                default: {
                    System.out.println("Votre choix est invalid , veuillez faire un choix parmis la liste");
                    break;
                }

            }
        }

    }

    public static boolean verifierSiLeProduitAUnRabais(ArrayList<String> produitsAvecRabais, String choix) {

        for (String produit : produitsAvecRabais) {
            if (produit.equals(choix)) {
                return true;
            }

        }
        return false;
        //                choix.toLowerCase().equals("p")) ||
//                (choix.toLowerCase().equals("s") || choix.toLowerCase().equals("c")) ||
//                (choix.toLowerCase().equals("g") || choix.toLowerCase().equals("a")) ||
//                (choix.toLowerCase().equals("q"));
//
    }


}