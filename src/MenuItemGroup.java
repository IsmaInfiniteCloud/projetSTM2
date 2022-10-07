public class MenuItemGroup {
    private double prix ;


    public MenuItemGroup(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "MenuItemGroup{" +
                "prix=" + prix +
                '}';
    }
    public void start(){
        System.out.println("retourner le prix du billet pour le groupe");
    }

}
