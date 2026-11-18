
    public class Product implements IProduct {
        private final String[] names;   // single-dimensional array
        private final int[][] sales;    // 2D array: [product][month]

        public Product(String[] names, int[][] sales) {
            this.names = names;
            this.sales = sales;
        }

        public int GetTotalProductsSold() {
            int total = 0;
            for (int[] row : sales)
                for (int s : row) total += s;
            return total;
        }

        public double GetAverageProductSold() {
            int count = sales.length * sales[0].length;
            return (double) GetTotalProductsSold() / count;
        }

        public String GetMostPopularProduct() {
            int best = 0, bestTotal = -1;
            for (int i = 0; i < sales.length; i++) {
                int t = 0;
                for (int s : sales[i]) t += s;
                if (t > bestTotal) { bestTotal = t; best = i; }
            }
            return names[best] + "(" + bestTotal + ")";
        }
    }

