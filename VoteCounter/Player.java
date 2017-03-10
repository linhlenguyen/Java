public class Player{
  private String playerName;
  private Int playerId;

  private static Int playerIdCount = 0;

  pubic Player(String name){
    this.playerId = playerIdCount;
    playerIdCount++;
    this.playerName = name;
  }
}
