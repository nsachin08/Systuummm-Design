
public class PlayerDetails{

    public Person person;
    public PlayerType playerType;
    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;

    public PlayerDetails(Person person , PlayerType playerType){
        this.person = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }

    
}