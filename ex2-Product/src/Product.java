import java.util.Scanner;

public class Product {
    private String codeSP;
    private String name;
    private int price;
    private int amount;
    private double sale;
    private  Product() {
        this.codeSP = "";
        this.name = "";
        this.price = 0;
        this.amount = 0;
        this.sale = 0;
    }
    public Product(String codeSP, String name, int price, int amount, double sale) {
        this.codeSP = codeSP;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.sale = sale;
    }
    public String getCodeSP() {
        return codeSP;
    }
    public void setCodeSP(String codeSP) {
        this.codeSP = codeSP;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getSale() {
        return sale;
    }
    public void setSale(double sale) {
        this.sale = sale;
    }
    public double getTotalNoSale() {
        return price * amount;
    }
    public double getAfterSale() {
        return getTotalNoSale() * (100 - sale) / 100;
    }
    @Override
    public String toString() {
        return   "\n  "+ codeSP +"    " + name + "    " + price + "    " + amount + "    " + sale +"% " ;
    }
}
