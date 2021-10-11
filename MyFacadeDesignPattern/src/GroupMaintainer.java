
public class GroupMaintainer {
  public static String groupCreatedConfirmation(CommandType ft) {
	  GroupCreateAcitvity groupCreateAcitvity = new GroupCreateAcitvity();
	  IDbHandler dbHandlerInterface;
	  switch(ft) {
	   case PUBLIC:
		   dbHandlerInterface = new PublicGroup();
		   ArrayList[] publicGroupIng = groupCreateAcitvity.getPublicGroupIngradients();
		   dbHandlerInterface.storeData(publicGroupIng);
		   return dbHandlerInterface.storeConfirmationMethod();
	   case PRIVATE:
		   dbHandlerInterface = new PrivateGroup();
		   ArrayList[] privateGroupIng = groupCreateAcitvity.getPrivateGroupIngradients();
		   dbHandlerInterface.storeData(privateGroupIng);
		   return dbHandlerInterface.storeConfirmationMethod();
		default:
			return null;
	  }
  }
}
