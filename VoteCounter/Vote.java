public class Vote{
  private Int voteId;
  private Int playerId;

  private static Int voteCount = 0;

  public Vote(Int pId){
    this.voteId = voteCount;
    voteCount++;
    this.playerId = pId;
  }
}
