public class Player {
    String name;
    String peserta;
    int speed;
    int healthPoin;

    void run (){
        System.out.println(peserta + " Memasuki Lapangan...");
        System.out.println(name + "...is running");
        System.out.println("Speed .. " + speed + "km");
    }

    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
