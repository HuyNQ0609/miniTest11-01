import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Product[] products = new Product[5];
        products[0] = new Product("e098w4", "Oppo   ", 230000, 9, 28.0);
        products[1] = new Product("3a95bc", "iPhone ", 420000, 5, 12.5);
        products[2] = new Product("fg32k3", "Samsung", 430000, 6, 17.0);
        products[3] = new Product("4js5lx", "Realme ", 320000, 7, 13.0);
        products[4] = new Product("50sde6", "Xiaomi ", 410000, 5, 22.5);
        System.out.println(Arrays.toString(products));

        System.out.println("Total price after sale = " + totalPriceAfterSale(products));
        System.out.println("Total price difference after sale = " + (totalNoSale(products) - totalPriceAfterSale(products)));
    }
    public static double totalPriceAfterSale(Product[] arr) {
        double total = 0;
        for (Product i : arr) {
            total += i.getAfterSale();
        }
        return Math.round(total);
    }
    public static double totalNoSale(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.getTotalNoSale();
        }
        return Math.round(sum);
    }
}