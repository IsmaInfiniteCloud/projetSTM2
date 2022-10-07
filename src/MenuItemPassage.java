import java.util.Scanner;

public class MenuItemPassage {
    //attribus
    private double prix;
    private boolean aUnRabais ;
    String input = "";

    Scanner scanner = new Scanner(System.in);

    public MenuItemPassage(double prix, boolean aUnRabais, Scanner scanner) {
        this.prix = prix;
        this.aUnRabais = aUnRabais;
        this.scanner = scanner;
    }

    //Getters
    public double getPrix() {
        return prix;
    }

    //Setters
    public void setPrix(int prix) {
        this.prix = prix;
    }
    final static String MENUPASSAGE = "*Bienvenue a la STM      *\n" +
            "*Categories des titres de transport :       *\n" +
            "*Veuillez choisir une categorie d'achat :   *\n" +
            "******************************************  *\n" +
            "*1     1Passage        3$                   *\n" +
            "*2     2Passage        6$                   *\n" +
            "*3     10Passages     30$                   *\n" +
            "*Q     Quitter                              *\n" +
            "******************************************  *\n" +
            "*Veuillez faire votre choix :               *\n" +
            "";


    public double start() {
        System.out.println(MENUPASSAGE);
        boolean valid = false;
        while (!valid) {
            System.out.println("Veuillez faire un choix valide !");
            System.out.println(MENUPASSAGE);
            switch (input) {
                case "1": {
                    //afficherMenuPassage();
                    break;
                }
                case "2": {
                    //afficherMenuSoiree();
                    break;
                }
                case "3": {
                    //afficherMenuAbonnement();
                    break;
                }
                case "q": {
                    System.exit(0);
                    System.out.println("Merci d'avoir choisi la STM");
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }


            }


        }
        return this.getPrix();
    }
}