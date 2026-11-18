
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String[] names = {"Cozy Nights Monarch mattress",
                    "Restonic Barbados mattress",
                    "Sealy Phuket mattress"};
            int[][] sales = new int[3][3];

            for (int i = 0; i < names.length; i++) {
                for (int m = 0; m < 3; m++) {
                    System.out.print("Enter number of sales for month " + (m + 1)
                            + " for " + names[i] + ": ");
                    sales[i][m] = in.nextInt();
                }
                System.out.println();
            }

            Product product = new Product(names, sales);
            PrintProduct printer = new PrintProduct(product);

            System.out.println("PRODUCT SALES REPORT - 2026");
            System.out.println("*".repeat(50));
            printer.PrintTotal();
            printer.PrintAverage();
            printer.PrintMostPopular();
        }
    }

