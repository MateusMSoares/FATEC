public class AppCompras {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("teteu", "@1");
        Item i1 = new Item("camisa", 75.00);
        Item i2 = new Item("camisa2", 70.00);
        Item i3 = new Item("camisa1", 60.00);

        Item i4 = new Item("tenis", 90.00);
        Item i5 = new Item("tenis1", 100.00);

        Grupoitens g1 = new Grupoitens("Grupo 1");
        g1.addProduct(i4);
        g1.addProduct(i5);

        

    }
}
