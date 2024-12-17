
public class PlayerBowlingController{

    Deque<PlayerDetails> bowlerList;
    Map<PlayerDetails,int> bowlersVsOverCount;
    PlayerDetails currentBowler;

    public PlayerBowlingController(List<PlayerDetails> bowlers){
        setBowlersList(bowlers);
    }

    private void setBowlersList(List<PlayerDetails> bowlers){
        this.bowlerList = new LinkedList<>();
        bowlersVsOverCount = new HashMap<>();

        for(PlayerDetails bowler : bowlers){
            this.bowlerList.addLast(bowler);
            bowlersVsOverCount.put(bowler,0);
        }
    }

    public void getNextBowler(int maxOverCountPerBowler){

        PlayerDetails playerDetails = bowlerList.poll();

        if(bowlersVsOverCount.get(playerDetails)+1 == maxOverCountPerBowler){
            currentBowler = playerDetails;
        }
        else{
            currentBowler = playerDetails;
            bowlerList.addLast(playerDetails);
            bowlersVsOverCount.put(playerDetails,bowlersVsOverCount.get(playerDetails)+1);
        }
    }

    public PlayerDetails getCurrentBowler(){
        return this.currentBowler;
    }
}