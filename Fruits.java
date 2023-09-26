public class Fruits {
    String name;
    double price;

    public static void main(String[] args) {
        Fruits f = new Fruits();
        f.name = "mango"; 
        f.price = 1000;
        System.out.println("Name of fruit: " + f.name); 
        System.out.println("Price of the fruits: "+f.price);
    }
}
