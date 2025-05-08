package Hotel;

public class Player {

    private String name;
    private String position;
    private int playerNr;
//    ArrayList<String> player = new ArrayList<>();

    //constructor
    public Player(String name, String position, int playerNr) {
        this.name = name;
        this.position = position;
        this.playerNr = playerNr;

    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getPlayerNr() {
        return playerNr;
    }
    public void setPlayerNr(int playerNr){
        this.playerNr = playerNr;
    }

}
