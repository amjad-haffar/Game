public class Player {
    private int player_coins;
    private String player_name;
    private Soldier[] player_soldires;
    private Squares[] player_squares;
    Player(String name){
        this.player_coins=15;
        this.player_name=name;
        this.player_soldires.add(new Soldier());
        //this.player_squares
    }
}
