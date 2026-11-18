public class PrintProduct {
    private final IProduct p;

    public PrintProduct(IProduct p) {
        this.p = p;
    }

    public void PrintTotal() {
        System.out.println("TOTAL PRODUCT SALES: " + p.GetTotalProductsSold());
    }

    public void PrintAverage() {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) p.GetAverageProductSold());
    }

    public void PrintMostPopular() {
        System.out.println("MOST POPULAR PRODUCT: " + p.GetMostPopularProduct());
    }
}