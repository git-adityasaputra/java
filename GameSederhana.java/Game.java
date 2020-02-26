public class Game {
    public static void main(String[] args) {
        Player players = new Player();

        players.peserta = "didit";
        players.name = "didit";
        players.speed = 75;
        players.healthPoin=0;   

        players.run();

        if (players.isDead()) {
            System.out.println("Game overr!!");
        }
    }
}
