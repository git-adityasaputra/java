class Bintang {
    public static void main(String[] args) {
        args = new String[] { "4" };
        int n = Integer.parseInt(args[0]);
        int i, j, k;
        for (i = 0; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
