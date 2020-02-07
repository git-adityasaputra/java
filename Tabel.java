public class Tabel {
    public static void main(String[] args) {
        args = new String[] { "3" };
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= 3; i++) {
            System.out.print("+----");
        }
        System.out.print("+");
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            System.out.print("|    ");
        }
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            System.out.print("+----");
        }
        System.out.print("+");
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            System.out.print("|    ");
        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.print("+----");
        }
        System.out.print("+");

    }
}
