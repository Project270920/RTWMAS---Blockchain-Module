package main.blockchain.block.data;

public class UserFeedback {

	private String userID;
	private String toiletID;
	private boolean parameter1;
	private boolean parameter2;
	private boolean parameter3;
	private boolean parameter4;
	private boolean parameter5;
	private boolean parameter6;
	private boolean parameter7;
	private boolean parameter8;

	public UserFeedback()	{	}
		
	public UserFeedback(String userID, String toiletID, boolean parameter1, boolean parameter2, boolean parameter3, boolean parameter4,
			boolean parameter5, boolean parameter6, boolean parameter7, boolean parameter8) {
		this.userID = userID;
		this.toiletID = toiletID;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
		this.parameter4 = parameter4;
		this.parameter5 = parameter5;
		this.parameter6 = parameter6;
		this.parameter7 = parameter7;
		this.parameter8 = parameter8;
	}

	public void setUserID(String userID)			{	this.userID = userID;			}
	public void setToiletID(String toiletID)		{	this.toiletID = toiletID;		}
	public void setParameter1(boolean parameter1)	{	this.parameter1 = parameter1;	}
	public void setParameter2(boolean parameter2)	{	this.parameter2 = parameter2;	}
	public void setParameter3(boolean parameter3) 	{	this.parameter3 = parameter3;	}
	public void setParameter4(boolean parameter4) 	{	this.parameter4 = parameter4;	}
	public void setParameter5(boolean parameter5) 	{	this.parameter5 = parameter5;	}
	public void setParameter6(boolean parameter6) 	{	this.parameter6 = parameter6;	}
	public void setParameter7(boolean parameter7) 	{	this.parameter7 = parameter7;	}
	public void setParameter8(boolean parameter8) 	{	this.parameter8 = parameter8;	}
	
	public String getUserID() 		{	return userID;		}
	public String getToiletID()		{	return toiletID;	}
	public boolean isParameter1()	{	return parameter1;	}
	public boolean isParameter2()	{	return parameter2;	}
	public boolean isParameter3()	{	return parameter3;	}
	public boolean isParameter4()	{	return parameter4;	}
	public boolean isParameter5() 	{	return parameter5;	}
	public boolean isParameter6()	{	return parameter6;	}
	public boolean isParameter7() 	{	return parameter7;	}
	public boolean isParameter8() 	{	return parameter8;	}
	@Override
	public String toString() {
		return "UserFeedback [userID=" + userID + "toiletID=" + toiletID + ", parameter1=" + parameter1 + ", parameter2=" + parameter2
				+ ", parameter3=" + parameter3 + ", parameter4=" + parameter4 + ", parameter5=" + parameter5
				+ ", parameter6=" + parameter6 + ", parameter7=" + parameter7 + ", parameter8=" + parameter8 + "]";
	}	
}