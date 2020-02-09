public class BolaPantul {

    public static int bolaPantul(double tinggiAwal) {
        double height = tinggiAwal;
        int count = 0;
        while (height >= 1) {
            height *= 0.75;
            count++;
        }
        return count++;
    }

    public static int bolaPantulR(double tinggiAwal) {
        return tinggiAwal >= 1 ? bolaPantulR(tinggiAwal * 0.75) + 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(bolaPantul(4));

    }
}