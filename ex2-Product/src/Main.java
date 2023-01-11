import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("3a95bc", "iPhone ", 420000, 5, 12.5);
        Product product2 = new Product("fg32k3", "Samsung", 430000, 6, 17.0);
        Product product3 = new Product("4js5lx", "Realme ", 320000, 7, 13.0);
        Product product4 = new Product("50sde6", "Xiaomi ", 410000, 5, 22.5);
        Product product5 = new Product("e098w4", "Oppo   ", 230000, 9, 28.0);
        Product[] array = {product1, product2, product3, product4, product5};
        System.out.println(Arrays.toString(array));

        double[][] arr = {  {product1.getTotalNoSale(), product1.getAfterSale()},
                            {product2.getTotalNoSale(), product2.getAfterSale()},
                            {product3.getTotalNoSale(), product3.getAfterSale()},
                            {product4.getTotalNoSale(), product4.getAfterSale()},
                            {product5.getTotalNoSale(), product5.getAfterSale()} };

        double totalPriceDifference =  totalNoSale(arr)- totalPriceAfterSale(arr);
        System.out.println("Total price after sale = " + totalPriceAfterSale(arr));
        System.out.println("Total price difference after sale = " + totalPriceDifference);
    }
    public static double totalPriceAfterSale(double[][] arr) {
        double total = 0;
        for (double[] doubles : arr) {
            total += doubles[1];
        }
        return total;
    }
    public static double totalNoSale(double[][] arr) {
        double sum = 0;
        for (double[] doubles : arr) {
            sum += doubles[0];
        }
        return sum;
    }
}