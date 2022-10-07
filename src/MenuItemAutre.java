public class MenuItemAutre {

    private double prix;

    public MenuItemAutre(double prix) {
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
        return "MenuItemAutre{" +
                "prix=" + prix +
                '}';
    }
    public Invoice start(){
        System.out.println(" le prix est : "+ getPrix() + "$");
        Invoice invoice = new InvoiceWithoutDiscount(getPrix(), App.TAXRATE);
        return invoice;
    }
}
