public class User{
  private String userIdentifier;
  private Int userId;

  private static Int userIdCount = 0;

  public User(String identifier){
    this.userId = userIdCount;
    userIdCount++;
    this.userIdentifier = identifier;
  }
}
